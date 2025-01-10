package com.edaakyil.kotlin.util.console

internal fun readWithPrompt(prompt: String): String {
    print(prompt)
    return readln()
}

fun readInt(prompt: String) = readWithPrompt(prompt).toInt()

fun readLong(prompt: String) = readWithPrompt(prompt).toLong()

fun readDouble(prompt: String) = readWithPrompt(prompt).toDouble()

fun readString(prompt: String) = readWithPrompt(prompt)

fun printArray(arr: IntArray, n: Int = -1, sep: String = " ", end: String = "\n") {
    // val fmt = "%%0%dd%%s".format(n) // n == 2 ise "%02d%s"
    // val fmt = if (n > 0) "%%0%dd%%s".format(n) else "%d%s"
    val fmt = "%%0%dd%%s".format(if (n < 1) 1 else n)

    for (v in arr)
        print(fmt.format(v, sep))

    print(end)
}

fun printArray(arr: LongArray, n: Int = -1, sep: String = " ", end: String = "\n") {
    val fmt = "%%0%dd%%s".format(if (n < 1) 1 else n)

    for (v in arr)
        print(fmt.format(v, sep))

    print(end)
}

fun printArray(arr: DoubleArray, n: Int = -1, sep: String = " ", end: String = "\n") {
    // val fmt = "%%.%df%%s".format(n)
    val fmt = if (n == -1) "%f%s" else "%%.%df%%s".format(n)

    for (v in arr)
        print(fmt.format(v, sep))

    print(end)
}
