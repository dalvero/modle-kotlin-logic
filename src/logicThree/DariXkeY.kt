package logicThree

import consoleUtility.Utility

/*
Soal :
    Dibaca sebuah bilangan bulat X dan Y. Tampilkan  semua bilangan bulat dari X  hingga
    Y dalam satu baris (dipisahkan oleh 1 spasi).

Spesifikasi Input :
    Satu baris berisi dua buah bilangan bulat X dan Y (0 ≤ X ≤ Y ≤ 100), dipisahkan oleh 1 spasi.

Spesifikasi Output :
    Satu baris berisi seluruh bilangan bulat dari X hingga Y, dipisahkan oleh spasi kecuali sebelum bilangan pertama
*/

fun main(){
    Utility.printTitle(char = '=', title = "Dari X ke Y")

    // INPUTAN
    print("Masukan bilangan awal\t: ")
    val a = readlnOrNull()
    print("Masukan bilangan akhir\t: ")
    val b = readlnOrNull()

    // VALIDASI
    if (a != null && b != null){
        val awal = a.toIntOrNull()
        val akhir = b.toIntOrNull()
        if (awal != null && akhir != null && awal >= 0 && awal <= 100 && akhir >= 0 && akhir <= 100){
            for (i in awal..akhir){
                print("$i ")
            }
        } else {
            println("Terjadi kesalahan pada bilangan anda.")
        }
    } else {
        println("Terjadi kesalahan pada bilangan anda.")
    }
}