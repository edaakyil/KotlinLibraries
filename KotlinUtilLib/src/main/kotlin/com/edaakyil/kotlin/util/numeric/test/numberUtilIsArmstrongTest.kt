package com.edaakyil.kotlin.util.numeric.test

import com.edaakyil.kotlin.util.numeric.isArmstrong

fun main() = runIsArmstrongTest()

fun runIsArmstrongTest() {
    for (a in -10..99999)
        if (isArmstrong(a))
            print("$a ")
}