package oop_160839_KappaAlbeth.Week08

import kotlin.text.get

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Ekstrak id dan name menggunakan requireNotNull dengan pesan error custom[cite: 20]
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }[cite: 20]
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }[cite: 20]

        // Ekstrak type sebagai String[cite: 20]
        val type = rawJson["type"] as? String[cite: 20]

        return when (type) {
            "ELECTRONIC" -> {
                // Ekstrak warranty menggunakan as? Int dengan fallback Elvis (?: 12)[cite: 20]
                val warranty = rawJson["warranty"] as? Int ?: 12[cite: 20]
                Electronic(id, name, warranty)[cite: 20]
            }
            "CLOTHING" -> {
                // Ekstrak size menggunakan as? String dengan fallback Elvis (?: "All Size")[cite: 20]
                val size = rawJson["size"] as? String ?: "All Size"[cite: 20]
                Clothing(id, name, size)[cite: 20]
            }
            else -> null // Jika tipenya selain itu (atau null), return null[cite: 20]
        }
    }
}