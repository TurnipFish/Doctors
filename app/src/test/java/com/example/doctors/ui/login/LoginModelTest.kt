package com.example.doctors.ui.login

import com.example.doctors.ui.login.helper.LoginHelper
import com.example.doctors.util.data.MyContentDataSource
import com.nhaarman.mockitokotlin2.argumentCaptor
import org.hamcrest.CoreMatchers
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.MockitoAnnotations.initMocks

class LoginModelTest {
    //region constants
    val DUMMY_USERNAME = "some_username"
    val DUMMY_PASSWORD = "some_password"
    //endregion constants

    var SUT: LoginModel? = null

    @Mock
    lateinit var loginHelperMock: LoginHelper


    @Before
    fun setUp() {
       initMocks(this)
        SUT = LoginModel(loginHelperMock)
    }

    @Test
    fun login_correctParametersPassedToLoginModel(){
        //Arrange
        val argsCaptor = argumentCaptor<String>()
        //Act
        SUT?.login(MyContentDataSource.USER_NAME, MyContentDataSource.USER_PASSWORD)
        //Assert
        Mockito.verify(loginHelperMock, Mockito.times(1)).login(argsCaptor.capture(), argsCaptor.capture())
        val captures = argsCaptor.allValues
        assertThat(captures[0], CoreMatchers.`is`(MyContentDataSource.USER_NAME))
        assertThat(captures[1], CoreMatchers.`is`(MyContentDataSource.USER_PASSWORD))
    }
}