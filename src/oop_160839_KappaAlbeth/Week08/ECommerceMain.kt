package oop_160839_KappaAlbeth.Week08

import kotlin.collections.iterator
import kotlin.text.get

fun main() {
    val rawApiData: List> = listOf(
    mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
    mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
    mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
    mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
    mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    // Instansiasi ApiParser
    val parser = ApiParser()

    // Iterasi for (raw in rawApiData)
    for (raw in rawApiData) {
        try {
            // Bungkus pemanggilan parseProduct(raw) dalam try-catch
            val product = parser.parseProduct(raw)

            // Jika sukses dan tidak me-return null (gunakan ?.let), panggil checkout()
            product?.let {
                parser.checkout(it)
            } ?: println("Log Warning: Produk dengan ID ${raw["id"]} memiliki tipe yang tidak dikenal atau bernilai null.")

        } catch (e: IllegalArgumentException) {
            // Cetak peringatan log jika data korup (tertangkap di catch)
            println("Log Error: ${e.message}")
        }
    }
}