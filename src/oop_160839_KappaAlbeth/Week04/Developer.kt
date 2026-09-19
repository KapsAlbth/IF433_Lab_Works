package oop_160839_KappaAlbeth.Week04

class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguage: String) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
}