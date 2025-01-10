package com.edaakyil.kotlin.util.string.test

import com.edaakyil.kotlin.util.string.isPangramEN
import com.edaakyil.kotlin.util.string.isPangramTR

fun main() = runStringUtilIsPangramTest()

fun runStringUtilIsPangramTest() {
    runIsPangramTRTest()
    runIsPangramENTest()
}

fun runIsPangramTRTest() {
    while (true) {
        print("Bir yazı giriniz:")
        val s = readln()

        if ("elma" == s)
            break

        println(if (isPangramTR(s)) "Pangram" else "Pangram değil")
    }
}

fun runIsPangramENTest() {
    while (true) {
        print("Input a text:")
        val s = readln()

        if ("quit" == s)
            break

        println(if (isPangramEN(s)) "Pangram" else "Not a Pangram")
    }
}