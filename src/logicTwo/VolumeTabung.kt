package logicTwo

import consoleUtility.Utility

/*
Soal :
    Menghitung Volume tabung jika diketahui jari-jarinya.
    Rumus: V = π × R2 x t, dengan V menunjukkan volume tabung,
    R menunjukkan jari-jari alas tabung, t menunjukkan tinggi tabung,
    dan π bernilai 3,14.

Spesifikasi Input :
    Satu baris berisi bilangan riil R (0 < R ≤ 100) dan bilangan riil t  (0 < t ≤ 100)

Spesifikasi Output :
    Satu baris berisi volume tabung dengan jari-jari R dan tinggi t
    yang menjadi input, dengan dua angka di belakang koma.
*/

fun main(){
    Utility.printTitle(char = '=', title = "Menghitung Volume Tabung")

    // INPUTAN
    print("Masukan jari-jari tabung\t: ")
    val r = readlnOrNull()
    print("Masukan tinggi tabung\t: ")
    val t = readlnOrNull()

    // VALIDASI
    if (r != null && t != null){
        val jariJari = r.toFloatOrNull()
        val tinggi = t.toFloatOrNull()
        if (jariJari != null && tinggi != null && jariJari <= 100 && jariJari > 0 && tinggi <= 100 && tinggi > 0){
            println(String.format("%.2f", 3.14 * jariJari * jariJari * tinggi))
        } else {
            println("Terjadi kesalahan pada bilangan anda.")
        }
    } else {
        println("Terjadi kesalahan pada bilangan anda.")
    }
}




