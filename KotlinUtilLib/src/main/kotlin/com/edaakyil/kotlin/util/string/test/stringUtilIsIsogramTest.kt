package com.edaakyil.kotlin.util.string.test

import com.edaakyil.kotlin.util.console.readString
import com.edaakyil.kotlin.util.string.isIsogramEN
import com.edaakyil.kotlin.util.string.isIsogramTR

fun main() = runIsIsogramTest()

fun runIsIsogramTest() {
    runIsIsogramTRTest()
    runIsIsogramENTest()
}

fun runIsIsogramTRTest() {
    while (true) {
        val s = readString("Bir yazı giriniz:")
        if ("quit" == s)
            break

        println(if (isIsogramTR(s)) "Isogram" else "Isogram değil")
    }
}

fun runIsIsogramENTest() {
    while (true) {
        val s = readString("Enter a text:")
        if ("quit" == s)
            break
        println(if (isIsogramEN(s)) "Isogram" else "Not an isogram")
    }
}