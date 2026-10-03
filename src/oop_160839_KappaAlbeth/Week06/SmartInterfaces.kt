package oop_160839_KappaAlbeth.Week06

interface SmartDevice {
    val id: String
    val name: String
}

// 2. Interface Switchable dengan abstract functions
interface Switchable {
    fun turnOn()
    fun turnOff()
}

// 3. Interface Recordable dengan abstract & default function
interface Recordable {
    fun startRecord()

    // Default function implementation
    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}