package oop_160839_KappaAlbeth.Week01

import java.awt.geom.Area

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14

    val area: Double = pi * radius * radius

    println("Radius: $radius, Area: $area")

    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        print("This is a Small Circle")
    }
}