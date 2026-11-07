package oop_160839_KappaAlbeth.Week04

open class Car(brand : String, val numberOfDoors: Int) : vehicle(brand) {

    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! MOBIL $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan")
    }
}