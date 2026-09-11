package oop_160839_KappaAlbeth.Week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- SISTEM PEMINJAMAN BUKU ---")
    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (Hari): ")
    var duration = scanner.nextInt()

    // Validasi: Jika lama pinjam minus, ubah menjadi 1 hari
    if (duration < 0) {
        println("LOG: Durasi tidak boleh minus. Otomatis diubah menjadi 1 hari.")
        duration = 1
    }

    // Instansiasi Objek Loan
    val loan = Loan(bookTitle, borrower, duration)

    // Tampilkan detail & total denda
    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku  : ${loan.bookTitle}")
    println("Peminjam    : ${loan.borrower}")
    println("Lama Pinjam : ${loan.loanDuration} hari")
    println("Total Denda : Rp ${loan.calculateFine()}")
}