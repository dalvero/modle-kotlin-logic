package logicFour

import consoleUtility.Utility

/*
Soal :
    Buatlah sebuah program untuk mengonversi suhu dalam satuan Reamur menjadi suhu dalam satuan Kelvin.
    Suhu °K = °R × 1.25 + 273

Spesifikasi Input :
    Satu baris berisi suhu dalam satuan Reamur dengan format bilangan riil, dengan jangkauan -273 ≤ suhu
    dalam Reamur ≤ 80.

Spesifikasi Output :
    Satu baris berisi nilai suhu dalam satuan Kelvin dengan dua angka di belakang koma.
*/

fun main(){
    Utility.printTitle(char = '=', title = "Reamur ke Kelvin")
    // INPUTAN USER
    print("Masukan suhu Reamur (-273 <= suhu <= 80) : ")
    val s = readlnOrNull()

    // VALIDASI
    if (s != null){
        val suhu = s.toIntOrNull()
        if (suhu != null && suhu >= -273 && suhu <= 80){
            println(String.format("%.2f", (suhu * 1.25) + 273))
        }
    } else {
        println("Terjadi kesalahan pada inputan anda.")
    }

}