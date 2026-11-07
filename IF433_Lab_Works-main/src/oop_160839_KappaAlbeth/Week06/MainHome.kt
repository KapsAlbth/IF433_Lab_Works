package oop_160839_KappaAlbeth.Week06

fun main() {
    // Instansiasi perangkat Smart Home
    val lamp = SmartLamp(id = "LAMP-01", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "SPK-01", name = "Google Nest Dapur")
    val cctv = SmartCCTV(id = "CCTV-01", name = "Ezviz Garasi")

    val hub = SmartHomeHub()
    println("=== MENAMBAHKAN PERANGKAT KE HUB ===")
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    // 3. Panggil activateSecurityMode()
    hub.activateSecurityMode()

    // 4. Panggil turnOffAllSwitches()
    hub.turnOffAllSwitches()
}