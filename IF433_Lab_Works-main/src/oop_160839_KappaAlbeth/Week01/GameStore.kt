package oop_160839_KappaAlbeth.Week01

fun main() {
    val gameTittle: String = "Roblox"
    val price: Int = 700000

    val userNote: String? = null
    printReciept(title = gameTittle, priceAwal = price, finalprice = calculateDiscount(price), userNote = userNote)

}

fun calculateDiscount(price: Int): Int = if (price > 500000) price-price*20/100 else price-price*10/100

fun printReciept(title: String, priceAwal: Int, finalprice: Int, userNote: String?){

    println("Judul: $title, HargaAwal: $priceAwal, HargaAkhir: $finalprice")
    println("Usernote: ${userNote ?: "Tidak ada Catatan"} ")
}