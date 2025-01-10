package com.edaakyil.kotlin.util.string.test

import com.edaakyil.kotlin.util.string.generateRandomTextEN

fun main() = runStringUtilGenerateRandomTextENTest()

fun runStringUtilGenerateRandomTextENTest() {
    while (true) {
        print("Input a count: ")
        val count = readln().toInt()

        if (count == 0)
            break

        val text = generateRandomTextEN(count)

        println(text)
    }
}