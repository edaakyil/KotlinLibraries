package com.edaakyil.kotlin.util.numeric.test

import com.edaakyil.kotlin.util.numeric.getPrime

fun main() = runGetPrimeTest()

fun runGetPrimeTest() {
    while (true) {
        print("Bir sayı giriniz:")
        val n = readln().toInt()

        if (n <= 0)
            break

        println("${n}. asal sayı: ${getPrime(n)}")
    }

    println("Tekrar yapıyor musunuz?")
}