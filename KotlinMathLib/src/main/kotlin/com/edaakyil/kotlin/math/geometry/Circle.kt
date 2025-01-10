package com.edaakyil.kotlin.math.geometry

import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.absoluteValue

open class Circle(radius: Double = 0.0) {
    var radius: Double = abs(radius)
        set(value) { field = abs(radius) }
    val area: Double
        get() = PI * radius * radius
    val circumference: Double
        get() = 2 * PI * radius

    override fun equals(other: Any?) = other is Circle && (radius - other.radius).absoluteValue < 0.00001

    override fun toString() = "Radius: $radius, Area: $area, Circumference: $circumference"
}