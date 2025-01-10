package com.edaakyil.kotlin.util.numeric.test

import com.edaakyil.kotlin.util.console.printArray
import com.edaakyil.kotlin.util.console.readInt
import com.edaakyil.kotlin.util.numeric.digits
import kotlin.random.Random

fun main() = runNumberUtilDigitsTest()

fun runNumberUtilDigitsTest() {
    val count = readInt("Bir sayı giriniz:")

    for (i in 1..count) {
        val value = Random.nextLong();
        print("$value -> ")
        printArray(digits(value))
    }
}