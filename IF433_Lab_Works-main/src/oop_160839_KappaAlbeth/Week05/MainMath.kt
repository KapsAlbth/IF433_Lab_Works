package oop_160839_KappaAlbeth.Week05

fun main() {
    val mathHelper = MathHelper()

    println("--- TES OVERLOADING MATHHELPER ---")

    val luasPersegi = mathHelper.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(5, 10)
    println("Luas Persegi Panjang (5x10): $luasPersegiPanjang")

    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas Lingkaran (r 7.0): $luasLingkaran")
}