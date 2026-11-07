package oop_160839_KappaAlbeth.Week09

fun main() {
    // Inisialisasi data uji minimal 6 TradeLog
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 15.5, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 20, -5.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 5, 25.0, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 15, -12.3, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 25, 45.8, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, -8.5, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    println(topPerformersString)

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()
}