package logicOne

import consoleUtility.Utility

/*
Soal :
    Buatlah (lengkapilah) program di bawah ini, untuk menghitung total biaya yang harus dibayar,
    jika diketahui biaya awal dan persen bunga pembayarannya.

Spesifikasi Input :
    Baris pertama berisi sebuah bilangan riil yang menyatakan biaya awal, di mana biaya awal selalu
    positif dan kurang dari 150000 (0 < biaya awal < 150000). Baris kedua berisi sebuah bilangan riil
    yang menyatakan bunga dalam persen (0 ≤ bunga ≤ 100) .

Spesifikasi Output :
    Satu baris berisi total biaya yang harus dibayar dengan dua angka di belakang koma.
 */

fun main(){
    Utility.printTitle(char = '=', title = "Hitung Biaya Setelah Bunga")
    // INPUTAN USER
    print("Masukan biaya awal\t\t: ")
    val a = readlnOrNull()
    print("Masukan bunga (0%-100%)\t: ")
    val b = readlnOrNull()

    // KONVERSI DAN VALIDASI
    if (a != null && b != null){
        val biayaAwal = a.toFloatOrNull()
        val bunga = b.toFloatOrNull()

        // VALIDASI BIAYA AWAL DAN BUNGA
        if (biayaAwal != null && biayaAwal < 150000 && biayaAwal > 0){
            if (bunga != null && bunga <= 100 && bunga >= 0){
                // KALKULASI TOTAL BIAYA
                val totalBiaya : Float = (biayaAwal + (biayaAwal * bunga / 100))
                // FORMAT PRINT 2 ANGKA DIBELAKANG KOMA
                val totalFormat = String.format("%.2f", totalBiaya)
                println("Biaya setelah bunga\t\t: $totalFormat")
            } else {
                println("Bunga dimulai dari 0% hingga 100%")
            }
        } else {
            println("Biaya awal dimulai dari 0 sampai kurang dari 150000")
        }
    }


}