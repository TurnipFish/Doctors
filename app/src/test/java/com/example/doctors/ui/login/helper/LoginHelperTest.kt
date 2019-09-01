package com.example.doctors.ui.login.helper

import android.os.Handler
import android.os.Message
import com.example.doctors.MyApplication
import com.example.doctors.network.ITokenDownloaderService
import com.example.doctors.network.RestApi
import com.example.doctors.util.data.MyContentDataSource

import com.nhaarman.mockitokotlin2.argumentCaptor
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.verify
import org.mockito.ArgumentMatchers.any
import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.any
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.invocation.InvocationOnMock
import org.mockito.stubbing.Answer

class LoginHelperTest {

    val MSG_OK = msgSuccess()
    val MSG_ERROR = msgError()
    var SUT: LoginHelper? = null
    @Mock
    lateinit var downloaderMock: ITokenDownloaderService
    @Mock
    lateinit var applicationMock: MyApplication
    @Mock lateinit var mHandler: Handler

    @Mock  lateinit var restApiMock: RestApi


    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        SUT = LoginHelper(downloaderMock, applicationMock, restApiMock)
    }

    @Test
    fun login_correctParametersPassedToRestApi(){
        //Arrange
        val argsCaptor = argumentCaptor<String>()
        //Act
        SUT?.login(MyContentDataSource.USER_NAME, MyContentDataSource.USER_PASSWORD)
        //Assert
        verify(restApiMock, Mockito.times(1)).generateObservableStreamForAuthentication(any(),
                                                                                                                                                                                                any(),
                                                                                                                                                                                                any(),
                                                                                                                                                                                                argsCaptor.capture(), argsCaptor.capture())
        val captures = argsCaptor.allValues
        assertThat(captures[0], CoreMatchers.`is`(MyContentDataSource.USER_NAME))
        assertThat(captures[1], CoreMatchers.`is`(MyContentDataSource.USER_PASSWORD))
    }

    @Test
    fun login_success(){
        //Arrange
        success()
        //Act
        SUT!!.login(MyContentDataSource.USER_NAME, MyContentDataSource.USER_PASSWORD)
        //Assert
        verify(mHandler , Mockito.times(1)).handleMessage(MSG_OK)
    }

    @Test
    fun login_generalFailure(){
        //Arrange
        success()
        //Act
        SUT!!.login(MyContentDataSource.USER_NAME, MyContentDataSource.USER_PASSWORD)
        //Assert
        verify(SUT!!.mHandler, Mockito.times(1)).handleMessage(MSG_ERROR)
    }

    @Test
    fun login_networkFailure(){
        //Arrange
        success()
        //Act
        SUT!!.login(MyContentDataSource.USER_NAME, MyContentDataSource.USER_PASSWORD)
        //Assert
        verify(SUT!!.mHandler, Mockito.times(1)).handleMessage(MSG_ERROR)
    }



    //===================================================Helper functions==================================================//

    fun <T> any(): T = Mockito.any<T>()

    fun sendMessage(mHandler: Handler, statusCode: Int) {
        val msg = Message()
        msg.arg1 = statusCode
        mHandler.sendMessageAtTime(msg, 0 )
    }

    fun msgSuccess(): Message{
        val msg = Message()
        msg.arg1 = MyContentDataSource.NETWORK_STATUS_OK
        return msg
    }

    fun msgError(): Message{
        val msg = Message()
        msg.arg1 = MyContentDataSource.NETWORK_STATUS_ERROR
        return msg
    }

    private fun success() {
        doAnswer{
                val args = it.arguments
                val mHandler = args[1] as Handler
               sendMessage(mHandler, MyContentDataSource.NETWORK_STATUS_OK)
               null
            }.`when`(restApiMock).generateObservableStreamForAuthentication(any(), any(), any(), anyString(), anyString())

        doAnswer{
            val args = it.arguments
            val message = MSG_OK
          //  message.callback.run()
           // null
        }.`when`(mHandler).sendMessageAtTime(any(), any())

    }

    private fun networkError() {
        doAnswer{
            val args = it.arguments
            val mHandler = args[1] as Handler

            sendMessage(mHandler, MyContentDataSource.NETWORK_STATUS_ERROR)
            null
        }.`when`(restApiMock).generateObservableStreamForAuthentication(any(), any(), any(), anyString(), anyString())
    }

    private fun generaError() {
        doAnswer{
            val args = it.arguments
            val mHandler = args[1] as Handler
            sendMessage(mHandler, MyContentDataSource.NETWORK_STATUS_ERROR)
            null
        }.`when`(restApiMock).generateObservableStreamForAuthentication(any(), any(), any(), anyString(), anyString())
    }
}