package oop_160839_KappaAlbeth.Week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Awas! Monster ${event.monsterName} muncul secara tiba-tiba!")
        }
        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item // Destructuring payload
            println("Selamat! Kamu mendapatkan loot: $name (Damage: $damage, Rarity: $rarity)")
        }
        is BattleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Kamu berada di wilayah aman. Tidak ada musuh di sekitar.")
        }
    }
}