fun main() {
    println("---Testing Vehicle---")
    val generalVehicle = Vehicle(brand = "Sepeda Ontel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n---Testing Car---")
    val myCar = car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}