package logicFour

import consoleUtility.Utility

/*
Soal :
    Buatlah sebuah program untuk mengubah suatu kalimat ke dalam bentuk “alay”.
    Ketentuannya adalah:
    Huruf Diubah menjadi
    A atau a = 4
    I atau i = 1
    Z atau z = 2
    E atau e = 3
    G atau g = 6
    J atau j = 7
    B atau b = 8

Spesifikasi Input :
    Satu baris berisi string/array karakter dengan panjang maksimal 50 karakter.

Spesifikasi Output :
    Satu baris berisi string yang sudah berada dalam bentuk “alay”.
*/

fun main(){
    Utility.printTitle(char = '=', title = "Teks Alay")

    // ARRAY HURUF DAN ANGKA
    val huruf = arrayOf("A", "I", "Z", "E", "G", "J", "B")
    val angka = arrayOf("4", "1", "2", "3", "6", "7", "8")

    // INPUTAN USER
    print("Masukan teks : \n> ")
    var kalimatAwal = readlnOrNull()

    // VALIDASI
    if (kalimatAwal != null){
        for ((indeks, hrf) in huruf.withIndex()){
            val kalimatAkhir = kalimatAwal?.replace(hrf, angka[indeks], ignoreCase = true)
            kalimatAwal = kalimatAkhir
            if (indeks == huruf.size - 1){
                println(kalimatAkhir)
            }
        }
    }
}