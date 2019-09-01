package com.example.doctors.ui.doctors

import com.example.doctors.model.Doctor
import com.example.doctors.model.MyRealmQueries
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import io.realm.RealmResults
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

class DoctorsModelTest {
    //region constants

    //endregion constants

    var SUT: DoctorsModel? = null
    @Mock lateinit var myRealmQueriesMock: MyRealmQueries

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        SUT = DoctorsModel(myRealmQueriesMock)
    }

    @Test
    fun fetchAllDoctors_RealmResultsFetched(){
        //Arrange

        //Act
        val doctors: RealmResults<Doctor>? = SUT!!.fetchAllDoctors()
        //Assert
        verify(myRealmQueriesMock, times(1)).fetchAllDoctors()
        assertTrue(doctors is RealmResults<Doctor>?)
    }

    @Test
        fun clearDoctors_doctorsObjectCleared_true(){
        //Arrange
        success()
        //Act
        val result: Boolean = SUT!!.clearDoctors()
        //Assert
        verify(myRealmQueriesMock, times(1)).clearDoctors()
        assertTrue(result)
    }

    @Test
    fun clearDoctors_doctorsObjectCleared_false(){
        //Arrange
        failure()
        //Act
        val result: Boolean = SUT!!.clearDoctors()
        //Assert
        verify(myRealmQueriesMock, times(1)).clearDoctors()
        assertTrue(!result)
    }

    //==================================================Helpers==============================================//

    fun success(){
        `when`(myRealmQueriesMock.clearDoctors()).thenReturn(true)
    }

    fun failure(){
        `when`(myRealmQueriesMock.clearDoctors()).thenReturn(false)
    }

}