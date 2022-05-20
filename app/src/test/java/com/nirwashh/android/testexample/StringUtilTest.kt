package com.nirwashh.android.testexample

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class StringUtilTest {
    private lateinit var targetString: String

    @Before
    fun setUp() {
        targetString = ""
    }

    @Test
    fun toValidName_isCorrect() {
        Assert.assertEquals("Виктор ПЕЛЕВИН", "Виктор / Пелевин".toValidName())
        Assert.assertEquals("Виктор ПЕЛЕВИН", "Виктор   / Пелевин".toValidName())
    }

    @Test
    fun toValidName_isInvalid() {
        Assert.assertEquals(null, "/".toValidName())
        Assert.assertEquals(null, "/ Test".toValidName())
        Assert.assertEquals(null, "Дугин / Александр /".toValidName())
    }
}