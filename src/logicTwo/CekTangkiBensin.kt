package logicTwo

import consoleUtility.Utility

/*
Soal :
    Seseorang akan membeli bensin premium (Rp. 7600) sebanyak uang yang dia miliki.
    Setiap kendaraan memilki kapasitas bensin yang berbeda-beda. Tangki bensin kendaraan
    kemungkinan tidak cukup menanmpung bensin yang dibeli.
    Buatlah sebuah program untuk menghitung jumlah bensin yang dibeli dengan uang tertentu,
    dan tentukan apakah kapasitas tangki mencukupi atau tidak.

Spesifikasi Input :
    Satu baris berisi bilangan bulat yang menunjukkan uang yang dibayar (7600 ≤ uang ≤ 76000)
    dan bilangan riil yang menunjukkan kapasitas bensin kendaraan ( 1 ≤ kapasitas ≤ 10 ).

Spesifikasi Output :
    Satu baris berisi jumlah bensin yang dibeli dengan dua angka dibelakang koma dan
    keterangan tangki bensin yang tidak mencukupi apabilan jumlah bensin yang dibeli melebih
    kapasitas tangki.
*/

fun main(){
    Utility.printTitle(char = '=', title = "Cek Tangki Bensin")
    // INPUTAN USER
    print("Silahakan masukan uang anda (7600 - 76000) \t: ")
    val u = readlnOrNull()
    print("Silahakan ukuran tangki anda (1 - 10) \t: ")
    val t = readlnOrNull()

    // VALIDASI
    if (u != null && t != null){
        val uang = u.toFloatOrNull()
        val tangki = t.toFloatOrNull()
        if (uang != null && tangki != null && uang >= 7600 && uang <= 76000 && tangki >= 1 && tangki <= 10){
            val totalBensin : Float = uang.toFloat() / 7600
            if (tangki.toFloat() < totalBensin) {
                println(String.format("%.2f", totalBensin))
                println("Bensin Berlebih")
            } else {
                println(String.format("%.2f", totalBensin))
            }
        } else {
            println("Terjadi kesalahan pada inputan uang atau tangki.")
        }

    }
}