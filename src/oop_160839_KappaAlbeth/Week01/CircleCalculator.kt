package oop_160839_KappaAlbeth.Week01

import java.awt.geom.Area

fun main() {
    val radius = 7.0
    val pi = 3.14

    val area: Double = pi * radius * radius

    println("Radius: $radius, Area: $area")

    println(checkSize(area))
}

fun checkSize(area: Double) = if (area > 100) "This is a Big circle" else "This is a Small Circle"
