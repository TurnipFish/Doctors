package com.example.doctors.ui.login.helper

import android.os.Handler
import android.os.Message
import com.example.doctors.MyApplication
import com.example.doctors.network.ITokenDownloaderService
import com.example.doctors.network.RestApi
import com.example.doctors.util.data.MyContentDataSource
import com.example.doctors.util.general.DataFetchHelper

import com.nhaarman.mockitokotlin2.argumentCaptor
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.verify
import org.hamcrest.CoreMatchers
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import org.mockito.ArgumentMatchers.*
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import kotlin.reflect.KClass

class LoginHelperTest {

    var RUNNER_OK: LoginHelper.Runner? = null
    var RUNNER_ERROR: LoginHelper.Runner? = null
    var SUT: LoginHelper? = null
    @Mock
    lateinit var downloaderMock: ITokenDownloaderService
    @Mock lateinit var applicationMock: MyApplication
    @Mock lateinit var mHandlerMock: Handler
    @Mock  lateinit var restApiMock: RestApi


    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        SUT = LoginHelper(downloaderMock, applicationMock, restApiMock, mHandlerMock)

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
                                                                                                                                                                                                            any(),
                                                                                                                                                                                                            argsCaptor.capture(), argsCaptor.capture())
        val captures = argsCaptor.allValues
        assertThat(captures[0], CoreMatchers.`is`(MyContentDataSource.USER_NAME))
        assertThat(captures[1], CoreMatchers.`is`(MyContentDataSource.USER_PASSWORD))
    }

    @Test
    fun login_success(){
        //Arrange
        RUNNER_OK = runnerSuccess()
        success()
        //Act

        SUT!!.login(MyContentDataSource.USER_NAME, MyContentDataSource.USER_PASSWORD)
        //Assert
        assertEquals(SUT!!.check, true)
        //verify(RUNNER_OK!!, Mockito.times(1)).run()
       // verify(mHandlerMock , Mockito.times(1)).handleMessage(MSG_OK)
    }

    @Test
    fun login_generalFailure(){
        //Arrange
        RUNNER_ERROR = runnerFailure()
        generaError()
        //Act

        SUT!!.login(MyContentDataSource.USER_NAME, MyContentDataSource.USER_PASSWORD)
        //Assert
        //verify(SUT!!.mHandlerMock, Mockito.times(1)).handleMessage(MSG_ERROR)
        assertEquals(SUT!!.check, false)
        //verify(RUNNER_ERROR!!, Mockito.times(1)).run()
    }

    @Test
    fun login_networkFailure(){
        //Arrange
        RUNNER_ERROR = runnerFailure()
        networkError()
        //Act
        SUT!!.login(MyContentDataSource.USER_NAME, MyContentDataSource.USER_PASSWORD)
        //Assert
        assertEquals(SUT!!.check, false)
       // verify(RUNNER_ERROR, Mockito.times(1))!!.run()
    }



    //===================================================Helper functions==================================================//

    fun <T> any(): T = Mockito.any<T>()
    inline fun <reified T> cast(any: Boolean?) : T? = any as? T?

    fun runnerSuccess(): LoginHelper.Runner{
        return SUT!!.Runner(MyContentDataSource.NETWORK_STATUS_OK)
    }

    fun runnerFailure(): LoginHelper.Runner{
        return SUT!!.Runner(MyContentDataSource.NETWORK_STATUS_ERROR)
    }

    private fun success() {
        try {
            doAnswer {
                val args = it.arguments
                val mHandler = args[2] as Handler
                RUNNER_OK!!.run()
               //mHandler.postDelayed(RUNNER_OK, 100)
                null
            }.`when`(restApiMock).generateObservableStreamForAuthentication(
                any(),
                any(),
                any(),
                any(),
                anyString(),
                anyString()
            )

            doAnswer {
                val args = it.arguments
                val runner = args[0] as LoginHelper.Runner
                runner.run()
                // null
            }.`when`(mHandlerMock).postDelayed(any(), anyLong())
        } catch (ex: Exception){
            ex.printStackTrace()
        }
    }

    private fun networkError() {
        doAnswer{
            val args = it.arguments
            val mHandler = args[2] as Handler
            RUNNER_ERROR!!.run()
            null
        }.`when`(restApiMock).generateObservableStreamForAuthentication(any(), any(), any(), any(), anyString(), anyString())
    }

    private fun generaError() {
        doAnswer{
            val args = it.arguments
            val mHandler = args[2] as Handler
            RUNNER_ERROR!!.run()
            null
        }.`when`(restApiMock).generateObservableStreamForAuthentication(any(), any(), any(), any(), anyString(), anyString())
    }
}