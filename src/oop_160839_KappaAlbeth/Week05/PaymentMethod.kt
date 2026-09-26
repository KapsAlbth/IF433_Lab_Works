package oop_160839_KappaAlbeth.Week05

abstract class PaymentMethod(
    val accountName: String
) {

    abstract fun processPayment(amount: Double)
}