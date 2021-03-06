package com.nirwashh.android.testexample.triangle

class Triangle(private val sideA: Int, private val sideB: Int, private val sideC: Int) {

    fun isRightTriangle(): Boolean {
        return sideA.square() + sideB.square() == sideC.square() ||
                sideB.square() + sideC.square() == sideA.square() ||
                sideA.square() + sideC.square() == sideB.square()
    }
}

private fun Int.square(): Int {
    return this * this
}