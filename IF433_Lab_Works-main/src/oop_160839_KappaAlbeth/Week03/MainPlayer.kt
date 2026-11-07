package oop_160839_KappaAlbeth.Week03

fun main() {
    val player = Player("JohnThor")

    // Coba akses player.xp (Baris ini harus di-comment karena akan memicu error "cannot access 'xp': it is private in 'Player'")
    // println(player.xp)

    println("--- TES LEVELING PLAYER ---")
    println("Level awal: ${player.level}")

    // Panggil addXp(50) -> Total XP 50 (Masih Level 1)
    player.addXp(50)
    println("Level saat ini: ${player.level}")

    // Panggil addXp(60) -> Total XP 110 (Harus Level Up ke 2)
    player.addXp(60)
    println("Level saat ini: ${player.level}")
}