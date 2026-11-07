package oop_160839_KappaAlbeth.Week04

class Manager(
    name: String,
    baseSalary: Int
) : Employee(name, baseSalary) { // Constructor chaining ke parent class Employee

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        // Mengembalikan bonus standar dari super class ditambah Rp 500.000
        return super.calculateBonus() + 500000
    }
}