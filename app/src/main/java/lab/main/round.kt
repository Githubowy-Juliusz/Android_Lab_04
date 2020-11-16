package lab.main

import kotlin.math.pow

fun round(number: Double, decimalPlaces: Int): Double {
	val powerOfTen = 10.0.pow(decimalPlaces)
	return kotlin.math.round(number * powerOfTen) / powerOfTen
}