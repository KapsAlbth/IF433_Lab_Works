package oop_160839_KappaAlbeth.Week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("Smart CCTV '$name' (ID: $id) dinyalakan.")
        startRecord() // Memanggil startRecord() secara otomatis saat menyala
    }

    override fun turnOff() {
        println("Smart CCTV '$name' (ID: $id) dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("Smart CCTV '$name' mulai merekam video...")
    }
}