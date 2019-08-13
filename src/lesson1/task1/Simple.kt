@file:Suppress("UNUSED_PARAMETER")

package lesson1.task1

import kotlinx.html.DIV
import kotlin.math.*

fun sqr(x: Int) = x * x

fun sqr(x: Double) = x * x

fun discriminant(a: Double, b: Double, c: Double) = sqr(b) - 4 * a * c

fun quadraticEquationRoot(a: Double, b: Double, c: Double) =
        (-b + sqrt(discriminant(a, b, c))) / (2 * a)

fun quadraticRootProduct(a: Double, b: Double, c: Double): Double {
    val sd = sqrt(discriminant(a, b, c))
    val x1 = (-b + sd) / (2 * a)
    val x2 = (-b - sd) / (2 * a)
    return x1 * x2 // Результат
}

fun main(args: Array<String>) {
    val x1x2 = quadraticRootProduct(1.0, 13.0, 42.0)
    println("Root product: $x1x2")

    val secInDay = seconds(8, 20, 35)
    println("Seconds in day = $secInDay")

    val metersInSagens = lengthInMeters(8, 2, 11)
    println("all length =  $metersInSagens")

    val radianInGradus = angleInRadian(36,14,35)
    println("radian v gradusah = $radianInGradus")

    val lengthTrack = trackLength(3.0, 0.0, 0.0, 4.0)
    println("dlinna otrezka = $lengthTrack")

    val thirdNumber = thirdDigit(3801)
    println("Tret'e 4islo = $thirdNumber")
}

fun seconds(hours: Int, minutes: Int, seconds: Int): Int = hours * 3600 + minutes * 60 + seconds

fun lengthInMeters(sagenes: Int, arshins: Int, vershoks: Int): Double = ((sagenes * 3 + arshins) * 16 + vershoks) * 0.04445

fun angleInRadian(deg: Int, min: Int, sec: Int): Double = (deg + (min / 60) + (sec / 3600)) * PI / 180

fun trackLength(x1: Double, y1: Double, x2: Double, y2: Double): Double = sqrt(sqr(x2 - x1) + sqr(y2 - y1))

fun thirdDigit(number: Int): Int = (number / 100) % 10

/**Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
 * прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
 * Определите время поезда в пути в минутах (в данном случае 216).
 */
fun travelMinutes(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int): Int = TODO()

/**
 * Простая
 *
 * Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).
 * Сколько денег будет на счету через 3 года (с учётом сложных процентов)?
 * Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
 */
fun accountInThreeYears(initial: Int, percent: Int): Double = TODO()

/**
 * Простая
 *
 * Пользователь задает целое трехзначное число (например, 478).
 * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
 */
fun numberRevert(number: Int): Int = TODO()
