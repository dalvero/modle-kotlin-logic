package logicTwo

import consoleUtility.Utility

/*
Soal :
    Buatlah program untuk menghitung jumlah luas 3 buah persegi yang
    memiliki perbandingan sisi R1 : R2 : R3, jika diketahui S sisi persegi ke-1.

Spesifikasi Input :
    Satu baris berisi bilangan bulat R1,R2,R3 yang menunjukkan rasio sisi setiap persegi
    (1 ≤ R1,R2,R3 ≤ 100) dan bilangan riil S  (0 < S ≤ 100)

Spesifikasi Output :
    Satu baris berisi jumlah luas 3 buah persegi dengan perbandingan setiap sisinya
    R1,R2,R3 dan sisi S yang menjadi input, dengan dua angka di belakang koma.
*/

fun main(){
    Utility.printTitle(char = '=', title = "Jumlah Perbandingan Luas 3 Persegi")
    // INPUTAN
    print("Masukan rasio sisi persegi ke-1\t: ")
    val a = readlnOrNull()
    print("Masukan rasio sisi persegi ke-2\t: ")
    val b = readlnOrNull()
    print("Masukan rasio sisi persegi ke-3\t: ")
    val c = readlnOrNull()
    print("Masukan sisi persegi ke-1\t\t: ")
    val d = readlnOrNull()

    if (a != null && b != null && c != null && d != null){
        val rasioSatu = a.toFloatOrNull()
        val rasioDua = b.toFloatOrNull()
        val rasioTiga = c.toFloatOrNull()
        val sisiSatu = d.toFloatOrNull()
        if (rasioSatu != null && rasioDua != null && rasioTiga != null && sisiSatu != null &&
            rasioSatu >= 1 && rasioSatu <= 100 && rasioDua >= 1 && rasioDua <= 100 && rasioTiga >= 1
            && rasioTiga <= 100 && sisiSatu > 0  && sisiSatu <= 100){
            val sisiDua = (rasioDua/rasioSatu * sisiSatu)
            val sisiTiga = (rasioTiga/rasioSatu * sisiSatu)
            val totalLuas = (sisiSatu * sisiSatu) + (sisiDua * sisiDua) + (sisiTiga * sisiTiga)
            println(String.format("%.2f", totalLuas))
        } else {
            println("Terjadi kesalahan pada sisi atau luas yang anda masukan.")   
        }
    } else {
        println("Terjadi kesalahan pada sisi atau luas yang anda masukan.")
    }









}