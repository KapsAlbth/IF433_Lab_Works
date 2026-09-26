package oop_160839_KappaAlbeth.Week05

fun main() {
    val wallet = EWallet("JohnThor Wallet", 50000.0)
    val card = CreditCard("JohnThor Card", 100000.0)
    val paymentMethods: List<PaymentMethod> = listOf(wallet, card)

    println("--- SIMULASI PEMBAYARAN POLYMORPHISM ---")

    for (method in paymentMethods) {
        method.processPayment(75000.0)
    }
}