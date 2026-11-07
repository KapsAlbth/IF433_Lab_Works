package oop_160839_KappaAlbeth.Week05

class CreditCard(
    accountName: String,
    val limit: Double,
    var usedAmount: Double = 0.0
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran sebesar Rp $amount berhasil menggunakan Kartu Kredit $accountName. Total penggunaan: Rp $usedAmount / Rp $limit")
        } else {
            println("Transaksi ditolak: Pemakaian melebihi limit kartu kredit!")
        }
    }
}