package com.edaakyil.kotlin.util.string

import kotlin.random.Random

fun capitalize(s: String) = if ("" != s) s[0].uppercase() + s.substring(1).lowercase() else ""

fun changeCase(s: String): String {
    val sb = StringBuilder(s)

    for (i in s.indices)
        sb[i] = if (sb[i].isLowerCase()) sb[i].uppercaseChar() else sb[i].lowercaseChar()

    return sb.toString()
}

/*
fun changeCase(s: String): String {
    val sb = StringBuilder(s)

    for (i in s.indices)
        sb[i] = when {
            sb[i].isUpperCase() -> sb[i].lowercaseChar()
            else -> sb[i].uppercaseChar()
        }

    return sb.toString()
}
*/

/*
fun changeCase(s: String): String {
    val sb = StringBuilder(s)

    for (c in s)
        sb.append(if (c.isLowerCase()) c.uppercase() else c.lowercase())

    return sb.toString()
}
*/

fun countString(s1: String, s2: String, ignoreCase: Boolean = false): Int {
    var count = 0
    var index = -1

    while (true) {
        index = s1.indexOf(s2, index + 1, ignoreCase)

        if (index == -1)
            break

        ++count
    }

    return count
}

fun generateRandomTextEN(count: Int, random: Random = Random): String {
    val sb = StringBuilder(count)

    for (i in 0..<count)
        sb.append((if (random.nextBoolean()) 'A' else 'a') + random.nextInt(26))

    return sb.toString()
}

private fun isIsogram(s: String, alphabet: String, ignoreCase: Boolean = false): Boolean {
    for (c in alphabet) {
        val i = s.indexOf(c, 0, ignoreCase)

        if (i == -1)
            return false

        if (s.indexOf(c, i + 1, ignoreCase) != -1)
            return false
    }

    return true
}

/*
fun isIsogram(s: String, alphabet: String, ignoreCase: Boolean = false): Boolean {
    val flags = BooleanArray(alphabet.length)

    for (c in s)
        if (c.isLetter())
            if (alphabet.contains(c, ignoreCase)) {
                val index = alphabet.indexOf(c, ignoreCase = ignoreCase)
                if (flags[index])
                    return false

                flags[index] = true
            } else
                return false

    for (flag in flags)
        if (!flag)
            return false

    return true
}
*/

fun isIsogramEN(s: String) = isIsogram(s.lowercase(), "abcdefghijklmnopqrstuvwxyz")

fun isIsogramTR(s: String) = isIsogram(s.lowercase(), "abcçdefgğhıijklmnoöprsştuüvyz")

private fun isPangram(s: String, alphabet: String, ignoreCase: Boolean = false): Boolean {
    for (c in alphabet)
        if (!s.contains(c, ignoreCase))
            return false

    return true
}

fun isPangramEN(s: String) = isPangram(s.lowercase(), "abcdefghijklmnopqrstuvwxyz")

fun isPangramTR(s: String) = isPangram(s.lowercase(), "abcçdefgğhıijklmnoöprsştuüvyz")

fun reverse(s: String) = StringBuilder(s).reverse().toString()