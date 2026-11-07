package oop_160839_KappaAlbeth.Week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu '$name' (ID: $id) dinyalakan dengan pencahayaan normal.")
    }

    override fun turnOff() {
        println("Lampu '$name' (ID: $id) dimatikan.")
    }
}