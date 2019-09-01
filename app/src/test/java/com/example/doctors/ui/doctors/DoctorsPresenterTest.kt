package com.example.doctors.ui.doctors

import com.example.doctors.model.Doctor
import org.hamcrest.CoreMatchers.instanceOf
import org.junit.Assert.assertThat
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import io.realm.RealmResults
import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.`is`
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner
import kotlin.reflect.KClass

@RunWith(MockitoJUnitRunner::class)
class DoctorsPresenterTest {
    //region constants
    val TEST_STRING = "Stephan/Mitte, Berlin"
    //endregion constants


    var SUT: DoctorsPresenter? = null
    @Mock lateinit var doctorsModelMock: DoctorsModel
    @Mock lateinit var doctorsView: DoctorsMVP.DoctorsView

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        SUT = DoctorsPresenter(doctorsModelMock)
    }

    @Test
    fun setView_activitySetInPresenter(){
        //Arrange

        //Act
        SUT?.setPresenterView(doctorsView)
        //Assert
        assertThat(SUT?.view, CoreMatchers.`is`(CoreMatchers.notNullValue()))
        assertThat(SUT?.view, CoreMatchers.`is`(doctorsView))
    }

    @Test
    fun clearDoctors_modelClearDoctorsCalled(){
        //Arrange

        //Act
        SUT!!.clearDoctors()
        //Assert
        verify(doctorsModelMock, times(1)).clearDoctors()
    }

    @Test
    fun deriveSearchOptions_arrayReturnedOfTheRightSize(){
        //Arrange

        //Act
        val ary: List<String> = SUT!!.deriveSearchOptions(TEST_STRING)
        //
        assertEquals(ary.size, 2)
        assertEquals(ary[0],  "Stephan")
        assertEquals(ary[1],  "Mitte, Berlin")
    }

    @Test
    fun fetchAllDoctors_modelfetchAllDoctorsCalled_RealmResultReturend(){
        //Arrange

        //Act
        val doctors: RealmResults<Doctor>? = SUT!!.fetchAllDoctors()
        //Assert
        verify(doctorsModelMock, times(1)).fetchAllDoctors()
        assertTrue(doctors is RealmResults<Doctor>?)
    }


}