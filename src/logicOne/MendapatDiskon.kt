package logicOne

import consoleUtility.Utility

/*
Soal :
    Buatlah program untuk menentukan jumlah uang yang harus dibayar
    apabila suatu barang dengan harga tertentu dan jumlah tertentu dapat
    mendapat potongan sebesar 15 % dari  total harga apabila jumlah barang
    yang dibeli adalah kelipatan 3 dan 4.

Spesifikasi Input :
    Sebuah bilangan riil yang merupakan harga barang
    ( 10000 ≤ hargaBarang ≤ 1000000 ) dan sebuah bilangan bulat yang merupakan
    jumlah barang  ( 1 ≤ jumlahBarang ≤ 100 )

Spesifikasi Output :
    Satu baris berisi total harga barang yang harus dibayar dengan dua angka dibelakang koma.
*/

fun main(){
    Utility.printTitle(char = '=', title = "Mendapatkan Discount")

    // INPUTAN USER
    print("Masukan harga barang\t: ")
    val a = readlnOrNull()
    print("Masukan jumlah barang\t: ")
    val b = readlnOrNull()

    // VALIDASI INPUTAN
    if (a != null && b != null) {
        val hargaBarang = a.toIntOrNull()
        val jumlahBarang = b.toIntOrNull()
        if (hargaBarang != null && hargaBarang <= 1000000 && hargaBarang >= 10000 && jumlahBarang != null && jumlahBarang <= 100 && jumlahBarang >= 1){
            // MENENTUKAN DISKON
            val discount : Int = if (jumlahBarang % 3 == 0 && jumlahBarang % 4 == 0){
                15
            } else {
                0
            }
            // KALKULASI TOTAL HARGA DAN FORMATNYA
            val totalHarga : Float = ((hargaBarang * jumlahBarang) - ((hargaBarang * jumlahBarang) * discount / 100)).toFloat()
            val totalHargaFormat = String.format("%.2f", totalHarga)
            println("Total harga barang anda\t: $totalHargaFormat")
        } else {
            println("Harga barang dimulai dari 10000 hingga 1000000.\nJumlah barang kelipatan 3 dan 4 akan mendapat diskon.")
        }
    }
}

















