package oop_160839_KappaAlbeth.Week04

fun main() {
    // Instansiasi objek Manager dan Developer
    val manager = Manager("Budi", 10000000)
    val developer = Developer("Siti", 8000000, "Kotlin")

    println("--- TES HIERARKI EMPLOYEE ---")

    // Pengujian Manager
    manager.work()
    println("Bonus ${manager.name}: Rp ${manager.calculateBonus()}")

    println()

    // Pengujian Developer
    developer.work()
    println("Bonus ${developer.name}: Rp ${developer.calculateBonus()}")
}