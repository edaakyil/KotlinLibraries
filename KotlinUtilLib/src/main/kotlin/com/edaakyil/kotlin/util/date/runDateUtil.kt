package com.edaakyil.kotlin.util.date

fun main() = runDateApp()

fun runDateApp() {
    while (true) {
        print("Day: ")
        val day = readln().toInt()

        if (day == 0)
            break

        print("Month: ")
        val month = readln().toInt()

        print("Year: ")
        val year = readln().toInt()

        printDate(day, month, year)
    }
}

