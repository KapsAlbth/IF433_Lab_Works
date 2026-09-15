package oop_160839_KappaAlbeth.Week03

fun main() {

    val w1 = Weapon("Excalibur")

    println("--- TES SETTER WEAPON ---")


    println("Mencoba set damage ke -50...")
    w1.damage = -50
    println("Damage saat ini: ${w1.damage}")

    println()


    println("Mencoba set damage ke 9999...")
    w1.damage = 9999
    println("Damage saat ini: ${w1.damage}")

    println()

    println("Tier Weapon: ${w1.tier}")
}