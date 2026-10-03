package oop_160839_KappaAlbeth.Week06

fun main() {
    // Instansiasi perangkat Smart Home
    val lamp = SmartLamp(id = "LAMP-01", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "SPK-01", name = "Google Nest Dapur")
    val cctv = SmartCCTV(id = "CCTV-01", name = "Ezviz Garasi")

    println("Berhasil menginstansiasi perangkat smart home:")
    println("- ${lamp.name}")
    println("- ${speaker.name}")
    println("- ${cctv.name}")
}