package logicTwo

import consoleUtility.Utility

/*
Soal :
    Buatlah program yang menampilkan bilangan yang tepat dua kali lipat dari
    bilangan yang berasal dari inputan pengguna.

Spesifikasi Input :
    Satu baris berisi sebuah bilangan bulat X (0 ≤ X ≤ 100).

Spesifikasi Output :
    Satu baris berisi sebuah bilangan bulat yang tepat dua kali lebih besar dari X.
 */

fun main(){
    Utility.printTitle(char = '=', title = "Dua Kali Lipat")

    // INPUTAN USER
    print("Masukan bilangan anda\t: ")
    val a = readlnOrNull()

    //VALIDASI
    if (a != null){
        val number = a.toIntOrNull()
        if (number != null && number >= 0 && number <= 100){
            val total = number * 2
            println("Dua kali lipat bilangan anda adalah $total")
        } else {
            println("Bilangan tidak diketahui.")
        }
    } else {
        println("Silahkan masukan bilangan terlebih dahulu.")
    }
}