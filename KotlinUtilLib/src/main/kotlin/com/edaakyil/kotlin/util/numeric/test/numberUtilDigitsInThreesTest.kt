package com.edaakyil.kotlin.util.numeric.test

import com.edaakyil.kotlin.util.console.printArray
import com.edaakyil.kotlin.util.console.readInt
import com.edaakyil.kotlin.util.numeric.digitsInThrees
import kotlin.random.Random

fun main() = runNumberUtilDigitsInThreesTest()

fun runNumberUtilDigitsInThreesTest() {
    val count = readInt("Bir sayı giriniz: ")

    for (i in 1..count) {
        val value = Random.nextLong();
        print("$value -> ")
        printArray(digitsInThrees(value))
        //printArray(digitsInThrees(value), n = 3)
    }
}