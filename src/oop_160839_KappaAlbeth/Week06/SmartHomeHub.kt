package oop_160839_KappaAlbeth.Week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' (ID: ${device.id}) berhasil ditambahkan ke SmartHomeHub.")
    }

    fun turnOffAllSwitches() {
        println("\n=== MEMATIKAN SEMUA PERANGKAT SWITCHABLE ===")
        for (device in devices) {
            // Smart Casting menggunakan operator 'is'
            if (device is Switchable) {
                device.turnOff() // Kotlin otomatis menganggap 'device' sebagai Switchable
            }
        }
    }
}