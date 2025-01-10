package com.edaakyil.kotlin.util.numeric.test

import com.edaakyil.kotlin.util.console.printArray
import com.edaakyil.kotlin.util.console.readInt
import com.edaakyil.kotlin.util.numeric.digitsInTwos
import kotlin.random.Random

fun main() = runNumberUtilDigitsInTwosTest()

fun runNumberUtilDigitsInTwosTest() {
    val count = readInt("Bir sayı giriniz: ")

    for (i in 1..count) {
        val value = Random.nextLong();
        print("$value -> ")
        printArray(digitsInTwos(value))
        //printArray(digitsInThrees(value), n = 3)
    }
}