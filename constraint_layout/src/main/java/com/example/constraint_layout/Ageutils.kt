package com.example.constraint_layout

import java.time.Month
import java.time.MonthDay
import java.time.Year
import java.util.*

object ageobj {

    fun calAge(year: Int,month: Int,day: Int):Int{
        val dob = Calendar.getInstance()
        val today = Calendar.getInstance()

        dob.set(year,month,day)

        val age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR)
        if (today.get(Calendar.DAY_OF_YEAR)< dob.get(Calendar.DAY_OF_YEAR)) {
            age

        }

        return age
        }
    }

