package logicOne

import consoleUtility.Utility

/*
Soal :
    Tampilkan semua bilangan bulat dari X hingga  Y, masing-masing dalam satu baris.

Spesifikasi Input :
    Satu baris berisi dua buah bilangan bulat X dan Y (0 ≤ X ≤ Y ≤ 100).

Spesifikasi Output :
    Seluruh bilangan bulat dari X hingga  Y, masing-masing dalam satu baris.
 */

fun main(){
    Utility.printTitle('=', 50, "Dari X ke Y")
    // INPUTAN USER
    print("Masukan Angka Pertama\t: ")
    val x = readlnOrNull()
    print("Masukan Angka Kedua\t\t: ")
    val y = readlnOrNull()

    println("Looping : ")
    // VALIDASI INPUTAN TIDAK NULL
    if (x != null && y != null){
        // CONVERSI INPUTAN KE TIPE INT
        val a = x.toIntOrNull()
        val b = y.toIntOrNull()
        // JIKA INPUTAN BERUPA INTEGER, TIDAK NULL DAN a LEBIH KECIL SAMA DENGAN b
        if (a != null && b != null && a <= b) for (i in a .. b){ println("$i")
        } else println("Inputan harus berupa angka dan dari kecil ke besar.")
    } else {
        println("Silahkan input dua angka secara lengkap.")
    }
}
