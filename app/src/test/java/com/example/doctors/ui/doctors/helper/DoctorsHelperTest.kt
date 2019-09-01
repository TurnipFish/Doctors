package com.example.doctors.ui.doctors.helper

import android.os.Handler
import com.example.doctors.MyApplication
import com.example.doctors.network.IContentDownloaderService
import com.example.doctors.network.RestApi
import com.example.doctors.util.data.MyContentDataSource
import com.nhaarman.mockitokotlin2.argumentCaptor
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.isNull
import com.nhaarman.mockitokotlin2.verify
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers

import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class DoctorsHelperTest {
    //region constants
    val FREE_TEXT = "Stephan"
    val LOCATION = "Mitte, Berlin"
    //endregion costants
    var RUNNER_OK: DoctorsHelper.Runner? = null
    var RUNNER_ERROR: DoctorsHelper.Runner? = null
    var SUT: DoctorsHelper? = null
    @Mock lateinit var applicationMock: MyApplication
    @Mock lateinit var downloaderMock: IContentDownloaderService
    @Mock lateinit var restApiMock: RestApi
    @Mock lateinit var mHandlerMock: Handler

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        SUT = DoctorsHelper(applicationMock, downloaderMock, restApiMock, mHandlerMock)
    }

    @Test
    fun fetchDoctors_correctParametersPassedToRestApi(){
        //Arrange
        val argsCaptor = argumentCaptor<String>()
        //Act
        SUT?.fetchDoctors(MyContentDataSource.FREE_TEXT, MyContentDataSource.LOCATION)
        //Assert
        verify(restApiMock, Mockito.times(1)).generateObservableStreamForDoctors(any(),
                                                                                                                                                                any(),
                                                                                                                                                                any(),
                                                                                                                                                                any(),
                                                                                                                                                                argsCaptor.capture(), argsCaptor.capture())
        val captures = argsCaptor.allValues
        Assert.assertThat(captures[0], CoreMatchers.`is`(MyContentDataSource.FREE_TEXT))
        Assert.assertThat(captures[1], CoreMatchers.`is`(MyContentDataSource.LOCATION))
    }

    @Test
    fun fetchDoctors_correctParametersPassedToRestApiNulls(){
        //Arrange
        val argsCaptor = argumentCaptor<String>()
        //Act
        SUT?.fetchDoctors(null, null)
        //Assert
        verify(restApiMock, Mockito.times(1)).generateObservableStreamForDoctors(any(),
            any(),
            any(),
            any(),
            argsCaptor.capture(), argsCaptor.capture())
        val captures = argsCaptor.allValues
        assertEquals(captures[0], null )
        assertEquals(captures[1], null )
    }

    @Test
    fun login_success(){
        //Arrange
        RUNNER_OK = runnerSuccess()
        success()
        //Act

        SUT!!.fetchDoctors(MyContentDataSource.FREE_TEXT, MyContentDataSource.LOCATION)
        //Assert
        assertEquals(SUT!!.check, true)

    }

    @Test
    fun login_generalFailure(){
        //Arrange
        RUNNER_ERROR = runnerFailure()
        generaError()
        //Act

        SUT!!.fetchDoctors(MyContentDataSource.FREE_TEXT, MyContentDataSource.LOCATION)
        //Assert
        assertEquals(SUT!!.check, false)
    }

    @Test
    fun login_networkFailure(){
        //Arrange
        RUNNER_ERROR = runnerFailure()
        networkError()
        //Act
        SUT!!.fetchDoctors(MyContentDataSource.FREE_TEXT, MyContentDataSource.LOCATION)
        //Assert
        assertEquals(SUT!!.check, false)
    }

    //===================================================Helper functions==================================================//

    fun <T> any(): T = Mockito.any<T>()
    inline fun <reified T> cast(any: Boolean?) : T? = any as? T?

    fun runnerSuccess(): DoctorsHelper.Runner{
        return SUT!!.Runner(MyContentDataSource.NETWORK_STATUS_OK)
    }

    fun runnerFailure(): DoctorsHelper.Runner{
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
            }.`when`(restApiMock).generateObservableStreamForDoctors(
                any(),
                any(),
                any(),
                any(),
                ArgumentMatchers.anyString(),
                ArgumentMatchers.anyString()
            )

            doAnswer {
                val args = it.arguments
                val runner = args[0] as DoctorsHelper.Runner
                runner.run()
                // null
            }.`when`(mHandlerMock).postDelayed(any(), ArgumentMatchers.anyLong())
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
        }.`when`(restApiMock).generateObservableStreamForDoctors(any(), any(), any(), any(),
            ArgumentMatchers.anyString(),
            ArgumentMatchers.anyString()
        )
    }

    private fun generaError() {
        doAnswer{
            val args = it.arguments
            val mHandler = args[2] as Handler
            RUNNER_ERROR!!.run()
            null
        }.`when`(restApiMock).generateObservableStreamForDoctors(any(), any(), any(), any(),
            ArgumentMatchers.anyString(),
            ArgumentMatchers.anyString()
        )
    }


}