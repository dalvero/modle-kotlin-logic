package logicThree

import consoleUtility.Utility

/*
Soal :
    Satpam sebuah gedung membutuhkan sebuah program untuk mengetahui tindakan yang harus dilakukan
    kepada pengguna kendaraan bermotor yang parkir di tempat parkir kampus dan melakukan suatu pelanggaran.
    Berikut pelanggaran yang terjadi :
    1. Kehilangan karcis motor
    2. Tidak membawa STNK

    Berikut tindakan yang akan dilakukan :
    a. Kasus 1 dilakukan sebanyak kurang dari 4 kali, satpam berhak meminta KTP mahasiwa sebagai jaminan
    b. Kasus 1 dilakukan 4 kali atau lebih, satpam berhak meminta denda sebesar 10000 per-karcis
    c. Kasus 2 terjadi, mahasiswa diminta untuk pulang dan mengambil STNK terlebih dahulu

    Bantulah satpam Polban untuk menentkan tindakan yang harus dilakukan.

Spesifikasi Input :
    Satu baris berisi bilangan bulat yang menunjukkan nomor kasus dan banyaknya kasus yang terjadi.

Spesifikasi Output :
    Satu baris berisi tindakkan yang harus dilakukan oleh satpam.
 */

fun main(){
    Utility.printTitle(char = '=', panjang = 60 ,title = "Program Satpam")

    // INPUTAN USER
    print("Pelanggaran (1 = Kehilangan karcis, 2 = Tidak bawa STNK) : ")
    val a = readlnOrNull()
    print("Berapa kali terjadi : ")
    val b = readlnOrNull()

    // VALIDASI
    if (a != null && b != null){
        val pelanggaran = a.toIntOrNull()
        val hitungan = b.toIntOrNull()
        var sanksi = ""
        if (pelanggaran != null && hitungan != null && pelanggaran >= 1 && pelanggaran <= 2 && hitungan > 0){
            when(pelanggaran){
                1 -> sanksi = if (hitungan < 4){
                    "Serahkan KTP Anda !!!"
                } else {
                    "Bayar denda 10000 !!!"
                }
                2 -> sanksi = "Ambil STNK dulu !!!"
            }
            println(sanksi)
        } else {
            println("Terjadi kesalahan pada inputan anda.")
        }

    }
}