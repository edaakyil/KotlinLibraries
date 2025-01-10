package com.edaakyil.kotlin.util.array

import kotlin.random.Random

fun fillArray(arr: IntArray, origin: Int, bound: Int, random: Random = Random) {
    for (i in arr.indices)
        arr[i] = random.nextInt(origin, bound)
}

fun fillArray(arr: LongArray, origin: Long, bound: Long, random: Random = Random) {
    for (i in arr.indices)
        arr[i] = random.nextLong(origin, bound)
}

fun fillArray(arr: DoubleArray, origin: Double, bound: Double, random: Random = Random) {
    for (i in arr.indices)
        arr[i] = random.nextDouble(origin, bound)
}

fun generateRandomArray(count: Int, origin: Int, bound: Int, random: Random = Random): IntArray {
    val arr = IntArray(count)

    fillArray(arr, origin, bound, random)

    return arr
}

fun generateRandomArray(count: Int, origin: Long, bound: Long, random: Random = Random): LongArray {
    val arr = LongArray(count)

    fillArray(arr, origin, bound, random)

    return arr
}

fun generateRandomArray(count: Int, origin: Double, bound: Double, random: Random = Random): DoubleArray {
    val arr = DoubleArray(count)

    fillArray(arr, origin, bound, random)

    return arr
}