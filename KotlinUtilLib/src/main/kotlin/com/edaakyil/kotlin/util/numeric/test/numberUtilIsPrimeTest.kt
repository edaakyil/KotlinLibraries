package com.edaakyil.kotlin.util.numeric.test

import com.edaakyil.kotlin.util.numeric.isPrime

fun main() = runIsPrimeTest()

fun runIsPrimeTest() {
    for (n in 1L..100)
        if (isPrime(n))
            print("$n ")
    println()
    println(if (isPrime(1_000_003)) "Asal" else "Asal değil")
}