package logicThree

import consoleUtility.Utility

/*
Soal :
    Buatlah sebuah program untuk menghitung volume limas dengan alas segi empat.
    Rumus : V = 1 / 3 × P × L × T, dengan V menunjukkan volume, P menunjukkan panjang
    alas limas, L menunjukkan lebar alas limas, dan T menunjukkan tinggi limas.

Spesifikasi Input :
    Baris pertama berisi bilangan riil P. Baris kedua berisi bilangan riil L.
    Baris ketiga berisi bilangan riil T.
    Jangkauan nilai ketiga variabel tersebut adalah 0 < P, L, T < 20.

Spesifikasi Output :
    Satu baris berisi volume limas dengan enam angka di belakang koma.
*/

fun main(){
    Utility.printTitle(char = '=', title = "Volume Limas")
    // INPUTAN USER
    print("Masukan panjang limas\t: ")
    val p = readlnOrNull()
    print("Masukan lebar limas\t\t: ")
    val l = readlnOrNull()
    print("Masukan tinggi limas\t: ")
    val t = readlnOrNull()

    // VALIDASI
    if (p != null && l != null && t != null){
        val panjang = p.toFloatOrNull()
        val lebar = l.toFloatOrNull()
        val tinggi = t.toFloatOrNull()
        if (panjang != null && lebar != null && tinggi != null &&
            panjang < 20 && panjang > 0 && lebar > 0 && lebar < 20 &&
            tinggi > 0 && tinggi < 20){
            val volume = (panjang * lebar * tinggi) / 3
            println("Volume limas\t\t\t: ${String.format("%.6f", volume)}.")
        }
    } else {
        println("Terjadi kesalahan pada inputan anda.")
    }
}