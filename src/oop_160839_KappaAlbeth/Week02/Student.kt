package oop_160839_KappaAlbeth.Week02

class Student (
               val name: String,
               val nim: String,
               val major: String
){

init {
    //Validasi Sederhana: Cek panjang NIM
            if(nim.length !=5) {
                println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
            } else {
                print("Masukkan Jurusan: ")
                val major = scanner.nextline()

                val s1 = Student(name, nim, major)
                println("Status: Pendaftaran selesai.")
            }
}