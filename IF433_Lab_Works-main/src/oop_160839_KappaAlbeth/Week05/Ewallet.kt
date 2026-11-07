package oop_160839_KappaAlbeth.Week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran sebesar Rp $amount berhasil menggunakan E-Wallet $accountName. Sisa saldo: Rp $balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Berhasil top up sebesar Rp $amount. Saldo saat ini: Rp $balance")
        } else {
            println("Jumlah top up harus lebih dari 0!")
        }
    }
}