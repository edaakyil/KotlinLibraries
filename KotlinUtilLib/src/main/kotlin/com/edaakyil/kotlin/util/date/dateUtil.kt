/*
Sınıf Çalışması: Parametresi ile aldığı gün, ay ve yıl bilgisine ilişkin tarihin haftanın hangi gününe geldiğini döndüren
getDayOfWeek global fonksiyonunu aşağıdaki açıklamalara uygun olarak yazınız.

Açıklama:
    - Programda tarih zamana ilişkin sınıflar kullanılmayacaktır.
    - getDayOfWeek fonksiyonu 1.1.1900 tarihinden sonraki tarihler için çalışacaktır.
    - Fonksiyon geçersiz bir tarih için -1 değerine geri dönecektir
    - Haftanın günü bilgisi, 1.1.1900 ile verilen tarih arasındaki toplam gün sayısı hesaplanıp 7 değerine göre modu
      alınarak bulunabilir. Bu değer, sıfır pazar, 1 pazartesi, ..., 6 Cumartesi olacak şekilde elde edilir.
    - Ay bilgisi, Ocak 1, Şubat 2, ...., Aralık 12 biçiminde verilebilecektir.
    - Programda dizi kullanılmayacaktır.
    - Çözüm şu ana kadar gördüğümüz konular kullanılarak yapılacaktır.

(İleride daha iyisi yazılacaktır)

 */
package com.edaakyil.kotlin.util.date

val daysOfMonths = arrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
val daysOfWeek = arrayOf("Sunday", "Monday", "Thuesday", "Wednesday", "Thursday", "Friday", "Saturday")
val months = arrayOf("", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")

fun isLeapYear(year: Int) = year % 4 == 0 && year % 100 != 0 || year % 400 == 0

fun isValidDate(day: Int, month: Int, year: Int) = day in 1..31 && month in 1..12 && year >= 1990 && day <= getDays(month, year)

fun getDays(month: Int, year: Int) = if (month == 2 && isLeapYear(year)) 29 else daysOfMonths[month]

fun getDayOfWeek(day: Int, month: Int, year: Int) = if (isValidDate(day, month, year)) getTotalDays(day, month, year) % 7 else -1

fun getDayOfYear(day: Int, month: Int, year: Int): Int {
    var dayOfYear = day

    for (m in month - 1 downTo 1)
        dayOfYear += getDays(m, year)

    return dayOfYear
}

fun getTotalDays(day: Int, month: Int, year: Int): Int {
    var totalDays = getDayOfYear(day, month, year)

    /*
    var a = year - 1
    while (a-- >= 1990)
        totalDays += if (isLeapYear(year)) 366 else 365
    */

    for (y in 1990..<year)
        totalDays += if (isLeapYear(year)) 366 else 365

    return totalDays
}

fun getDaySuffix(day: Int) = when (day) {
    1, 21, 31 -> "st"
    2, 22 -> "nd"
    3, 23 -> "rd"
    else -> "th"
}

fun printDate(day: Int, month: Int, year: Int) {
    val dayOfWeek = getDayOfWeek(day, month, year)

    if (dayOfWeek != -1)
        println("%d%s %s %04d %s".format(day, getDaySuffix(day), months[month], year, daysOfWeek[dayOfWeek]))
    else
        println("Invalid date")
}

/*
29/28-> Şubat(2)
30-> Nisan(4), Haziran(6), Eylül(9), Kasım(11)
31-> Ocak(1), Mart(3), Mayıs(5), Temmuz(7), Ağustos(8), Ekim(10), Aralık(12)
*/