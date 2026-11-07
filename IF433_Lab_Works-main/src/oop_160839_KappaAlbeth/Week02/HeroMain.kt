package oop_160839_KappaAlbeth.Week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- MINI RPG BATTLE ---")
    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(name, damage)
    var enemyHp = 100

    println("\nPertarungan Dimulai! HP Hero: ${hero.hp} | HP Enemy: $enemyHp\n")

    // Main Loop
    while (hero.isAlive() && enemyHp > 0) {
        println("=== MENU AKSI ===")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Sisa HP Enemy: $enemyHp")

            // Musuh membalas jika masih hidup
            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy membalas sebesar $enemyDamage damage!")
                hero.takeDamage(enemyDamage)
                println("Sisa HP ${hero.name}: ${hero.hp}")
            }
            println()
        } else if (choice == 2) {
            println("${hero.name} memilih kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!\n")
        }
    }

    println("--- HASIL PERTARUNGAN ---")
    if (hero.isAlive() && enemyHp == 0) {
        println("Selamat! ${hero.name} MENANG!")
    } else if (!hero.isAlive()) {
        println("Game Over! ${hero.name} telah gugur.")
    } else {
        println("Pertarungan berakhir karena ${hero.name} kabur.")
    }
}