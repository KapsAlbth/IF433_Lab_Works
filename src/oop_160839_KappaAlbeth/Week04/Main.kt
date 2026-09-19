package oop_160839_KappaAlbeth.Week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalvehicle = vehicle(brand = "Sepeda Ontel")
    generalvehicle.honk()
    generalvehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.accelerate()
    myCar.honk()
    myCar.openTrunk()
}