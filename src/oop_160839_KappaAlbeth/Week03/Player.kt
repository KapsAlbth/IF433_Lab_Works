package oop_160839_KappaAlbeth.Week03

class Player(
    val username: String
) {
    private var xp: Int = 0

    // Computed Property untuk menghitung level berdasarkan XP
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("WARNING: Amount XP harus angka positif!")
            return
        }

        val previousLevel = level
        xp += amount

        // Cek apakah terjadi kenaikan level
        if (level > previousLevel) {
            println("Level Up! Selamat $username naik ke level $level")
        }
    }
}