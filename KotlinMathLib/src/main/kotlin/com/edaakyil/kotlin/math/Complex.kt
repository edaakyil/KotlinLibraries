package com.edaakyil.kotlin.math

import kotlin.math.absoluteValue
import kotlin.math.sqrt

data class Complex(val real: Double = 0.0, val imaginary: Double = 0.0) {
    val norm: Double
        get() = sqrt(real * real + imaginary * imaginary)
    val length: Double
        get() = norm
    val conjugate: Complex
        get() = Complex(real, -imaginary)

    override fun equals(other: Any?) =
        other is Complex && (real - other.real).absoluteValue < 0.00001 && (imaginary - other.imaginary).absoluteValue < 0.00001

    override fun toString() = "($real, $imaginary)"
}