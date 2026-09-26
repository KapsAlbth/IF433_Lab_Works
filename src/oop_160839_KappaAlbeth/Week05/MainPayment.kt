package oop_160839_KappaAlbeth.Week05

fun main() {
    val wallet = EWallet("JohnThor Wallet", 50000.0)
    val card = CreditCard("JohnThor Card", 100000.0)
    val paymentMethods: List<PaymentMethod> = listOf(wallet, card)

    println("--- SIMULASI PEMBAYARAN POLYMORPHISM & SMART CASTING ---")

    for (method in paymentMethods) {
        method.processPayment(75000.0)

        // Smart Casting Challenge using 'is' operator
        if (method is EWallet) {
            println("\n[Smart Casting Detected: EWallet gagal bayar, melakukan TopUp...]")
            method.topUp(50000.0) // Kotlin otomatis menganggap 'method' sebagai EWallet
            println("Mencoba proses pembayaran lagi...")
            method.processPayment(75000.0)
        }
        println("--------------------------------------------------")
    }
}