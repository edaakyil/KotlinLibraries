package com.edaakyil.kotlin.util.numeric.test

import com.edaakyil.kotlin.util.numeric.numToStr3DigitsTR

fun main() = numberUtilNumToStr3DigitsTRTest()

fun numberUtilNumToStr3DigitsTRTest() {
    for (v in -999..999)
        println("$v -> ${numToStr3DigitsTR(v)}")
}