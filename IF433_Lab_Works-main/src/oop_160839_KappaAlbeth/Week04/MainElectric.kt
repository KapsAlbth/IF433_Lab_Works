package oop_160839_KappaAlbeth.Week04

fun main() {
    // Buat satu objek ElectricCar
    val myElectricCar = ElectricCar("Tesla Model 3", 4, 85)

    println("--- TES ELECTRIC CAR ---")

    // Panggil method accelerate(), honk(), dan openTrunk()
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()
}