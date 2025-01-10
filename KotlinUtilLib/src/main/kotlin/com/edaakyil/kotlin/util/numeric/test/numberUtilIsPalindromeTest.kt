package com.edaakyil.kotlin.util.numeric.test

import com.edaakyil.kotlin.util.numeric.isPalindrome

import kotlin.math.abs

fun main() = runIsPalindromeTest()

fun runIsPalindromeTest() {
    while (true) {
        print("Bir sayı giriniz: ")
        val value = readln().toInt()

        // println("$value sayısı " + if (isPalindrom(value)) "Palindrom'dur." else "Palindrom değildir.")
        println("$value sayısı ${if (isPalindrome(value)) "Palindrom" else "Palindrom değil"}")

        if (value == 0)
            break
    }
}