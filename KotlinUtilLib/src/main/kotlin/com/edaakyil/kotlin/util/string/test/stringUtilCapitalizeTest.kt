package com.edaakyil.kotlin.util.string.test

import com.edaakyil.kotlin.util.string.capitalize

fun main() = runStringUtilCapitalizeTest()

fun runStringUtilCapitalizeTest() {
    while (true) {
        print("Input text: ")
        val s = readln()

        if ("quit" == s)
            break

        println(capitalize(s))
    }
}