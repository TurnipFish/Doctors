package com.example.doctors.ui.login

import com.example.doctors.ui.login.helper.LoginHelper
import com.example.doctors.util.data.MyContentDataSource
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import com.nhaarman.mockitokotlin2.capture
import com.nhaarman.mockitokotlin2.argumentCaptor
import com.nhaarman.mockitokotlin2.isNotNull
import com.nhaarman.mockitokotlin2.notNull
import org.hamcrest.CoreMatchers.*
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations.initMocks

@RunWith(MockitoJUnitRunner::class)
class LoginPresenterTest {

    //region constants
    val DUMMY_USERNAME = "some_username"
    val DUMMY_PASSWORD = "some_password"
    //endregion constants

    var SUT: LoginPresenter? = null
    @Mock lateinit var loginModelMock: LoginModel
    @Mock lateinit var loginHelperMock: LoginHelper
    @Mock lateinit var loginView: LoginMVP.LoginView


    @Before
    fun setUp() {
        initMocks(this)
        SUT = LoginPresenter(loginModelMock, loginHelperMock)
    }

    @Test
    fun setView_activitySetInPresenter(){
        //Arrange

        //Act
       SUT?.setPresenterView(loginView)
        //Assert
        assertThat(SUT?.view, `is`(notNullValue()))
        assertThat(SUT?.view, `is`(loginView))
    }

    @Test
     fun checkCredentials_credentialsCorrect_returnTrue(){
        //Arrange

        //Act
       val result =  SUT?.checkCredentials(MyContentDataSource.USER_NAME, MyContentDataSource.USER_PASSWORD)
        //Assert
        assertThat(result, `is`(true))
    }

    @Test
    fun checkCredentials_credentialsCorrect_returnFalse(){
        //Arrange

        //Act
        val result =  SUT?.checkCredentials(DUMMY_USERNAME, DUMMY_PASSWORD)
        //Assert
        assertThat(result, `is`(false))
    }

    @Test
    fun login_correctParametersPassedToLoginModel(){
        //Arrange
        val argsCaptor = argumentCaptor<String>()
        //Act
         SUT?.login(MyContentDataSource.USER_NAME, MyContentDataSource.USER_PASSWORD)
        //Assert
        verify(loginModelMock, times(1)).login(argsCaptor.capture(), argsCaptor.capture())
        val captures = argsCaptor.allValues
        assertThat(captures[0], `is`(MyContentDataSource.USER_NAME))
        assertThat(captures[1], `is`(MyContentDataSource.USER_PASSWORD))
    }

//============================Help Classes =======================================//



}