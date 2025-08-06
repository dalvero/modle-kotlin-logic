package logicThree

import consoleUtility.Utility

/*
Soal :
    Buatlah sebuah program untuk menghitung total biaya parkir motor atau mobil dengan ketentuan berikut:
    1. Mobil dikenakan tarif Rp2.000 untuk satu jam pertama dan Rp1.000 untuk setiap satu jam berikutnya;
    2. Motor dikenakan tarif Rp1.000 untuk satu jam pertama dan Rp5.00 untuk setiap satu jam berikutnya.

Spesifikasi Input :
    1. Baris pertama berisi angka 1 jika kendaraan yang parkir adalah mobil, atau angka 2 jika kendaraan yang
    parkir adalah motor.

    2. Baris kedua berisi bilangan bulat berupa lama waktu parkir dalam satuan jam (0 < lama parkir ≤ 24).

Spesifikasi Output :
    Satu baris berisi bilangan bulat berupa total biaya parkir yang harus dibayarkan dalam rupiah
*/

fun main(){
    Utility.printTitle(char = '=', title = "Biaya Parkir")
    // INPUTAN
    print("Masukan jenis kendaraan (1 = Mobil, 2 = Motor) : ")
    val k = readlnOrNull()
    print("Masukan lama waktu parkir\t\t: ")
    val w = readlnOrNull()

    // VALIDASI
    if (k != null && w != null){
        val kendaraan = k.toIntOrNull()
        val waktu = w.toIntOrNull()
        if (kendaraan != null && waktu != null && kendaraan >= 1 && kendaraan <= 2 && waktu > 0 && waktu <= 24){
            val totalParkir : Int = if (kendaraan == 1){
                2000 + ((waktu - 1) * 1000)
            } else if (kendaraan == 2){
                1000 + ((waktu - 1) * 500)
            } else {
                0
            }
            println(totalParkir)
        } else {
            println("Terjadi kesalahan inputan.")
        }
    }  else {
        println("Terjadi kesalahan inputan.")
    }
}