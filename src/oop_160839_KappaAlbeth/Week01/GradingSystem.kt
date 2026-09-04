package oop_160839_KappaAlbeth.Week01

fun main(){
    val name: String = "John Thor"
    val score: Int = 80


    //Concatenation gaya lama
    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90.. 100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
    println("Status: ${calculatestatus(score)}")

    val studentId: String? = null
    val idLength = studentId?.length ?: 0
    print("Panjang ID: $idLength")
}

fun calculatestatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"