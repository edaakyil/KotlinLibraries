package com.edaakyil.kotlin.math.geometry

import kotlin.math.absoluteValue
import kotlin.math.sqrt

data class MutablePoint(var x: Double = 0.0, var y: Double = 0.0) {
    fun distance(other: MutablePoint) = distance(other.x, other.y)

    fun distance(a: Double = 0.0, b: Double = 0.0) = sqrt((x - a) * (x - a) + (y - b) * (y - b))

    fun offset(dx: Double, dy: Double = dx) {
        x += dx
        y += dy
    }

    override fun equals(other: Any?) =
        other is MutablePoint && (x - other.x).absoluteValue < 0.00001 && (y - other.y).absoluteValue < 0.00001

    override fun toString() = "($x, $y)"
}