package com.edaakyil.kotlin.util.array.test

import com.edaakyil.kotlin.util.array.generateRandomArray
import com.edaakyil.kotlin.util.console.printArray
import com.edaakyil.kotlin.util.console.readInt

fun main() = runArrayUtilGenerateRandomArrayTest()

fun runArrayUtilGenerateRandomArrayTest() {
    while (true) {
        val count = readInt("Dizinin eleman sayısını giriniz:")

        if (count <= 0)
            break

        val arrInt = generateRandomArray(count, 0, 100)
        val arrDouble = generateRandomArray(count, 2.345, 2.346)

        printArray(arrInt, 3)
        printArray(arrDouble, 4)
    }
}