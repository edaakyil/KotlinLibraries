package com.edaakyil.kotlin.util.string.test

import com.edaakyil.kotlin.util.string.countString

fun main() = runStringUtilCountStringTest()

fun runStringUtilCountStringTest() {
    while (true) {
        print("Input first text: ")
        val s1 = readln()

        if ("quit" == s1)
            break

        print("Input second text: ")
        val s2 = readln()

        println("Count: ${countString(s1, s2)}")
        print("Count (Ignore case): ${countString(s1, s2, true)}")
    }
}