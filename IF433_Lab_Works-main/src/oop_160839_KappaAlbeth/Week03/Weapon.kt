package oop_160839_KappaAlbeth.Week03

class Weapon(
    val name: String
) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("WARNING: Damage tidak boleh negatif! Nilai damage tidak diubah.")
            } else if (value > 1000) {
                println("WARNING: Damage terlalu overpower! Dipaksa set ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }


    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}