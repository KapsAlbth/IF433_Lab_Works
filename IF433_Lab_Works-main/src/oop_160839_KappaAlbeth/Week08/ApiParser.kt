package oop_160839_KappaAlbeth.Week08

import kotlin.text.get

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }

    // Langkah 4: Eksekusi Pembayaran[cite: 20]
    fun checkout(product: Product) {
        // Ekstrak ID dari product dengan pola when (karena ia sealed class)[cite: 20]
        val productId = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        // Lempar ID ke JavaPaymentService.processPayment(id)[cite: 20]
        // Gunakan !! pada hasil tangkapannya untuk membuktikan Java Interop[cite: 20]
        val transactionId: String = JavaPaymentService.processPayment(productId)!!

        // Print Transaction ID[cite: 20]
        println("Checkout Berhasil! Transaction ID: $transactionId")
    }
}