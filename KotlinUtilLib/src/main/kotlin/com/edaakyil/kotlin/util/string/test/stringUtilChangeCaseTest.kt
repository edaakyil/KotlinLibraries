package com.edaakyil.kotlin.util.string.test

import com.edaakyil.kotlin.util.string.changeCase

fun main() = runStringUtilChangeCaseTest()

fun runStringUtilChangeCaseTest() {
    while (true) {
        print("Input text:")
        val s = readln()

        if ("quit" == s)
            break

        val text = changeCase(s)

        println(text)
    }
}

