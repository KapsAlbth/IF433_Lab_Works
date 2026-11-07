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
}