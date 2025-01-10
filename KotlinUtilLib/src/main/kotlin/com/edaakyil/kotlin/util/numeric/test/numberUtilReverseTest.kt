package com.edaakyil.kotlin.util.numeric.test

import com.edaakyil.kotlin.util.numeric.reverse

fun main() = runReverseTest()

fun runReverseTest() {
    while (true) {
        print("Bir sayı giriniz: ")
        val value = readln().toInt()

        if (value == 0)
            break

        println("$value sayısının tersi: ${reverse(value)}")
    }
}