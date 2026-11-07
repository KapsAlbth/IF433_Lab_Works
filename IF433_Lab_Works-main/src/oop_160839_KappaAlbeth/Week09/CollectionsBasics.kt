package oop_160839_KappaAlbeth.Week09

fun main (){
    println("=== Test List ===")
    val framework: List<String> = listOf("Kotlin", "Java", "C++")
    println("immutable list: $framework")

    val scores: MutableList<Int> = mutableListOf(85,90)
    scores.add(95)
    scores[0] = 88
    print("Mutable List: $scores")
}