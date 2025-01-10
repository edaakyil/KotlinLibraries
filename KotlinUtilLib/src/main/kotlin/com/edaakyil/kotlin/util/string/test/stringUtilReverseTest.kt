package com.edaakyil.kotlin.util.string.test

import com.edaakyil.kotlin.util.string.reverse

fun main() = runStringUtilReverseTest()

fun runStringUtilReverseTest() {
    while (true) {
        print("Input a text: ")
        val s = readln()

        if ("quit" == s)
            break

        val str = reverse(s)

        println("($str)")
    }
}