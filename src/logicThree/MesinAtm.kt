package logicThree

import consoleUtility.Utility

/*
Soal :
    Eva sedang jalan-jalan di luar negeri dan ingin mengambil  x dolar Amerika dari sebuah ATM.
    Mesin ATM hanya mau mengeluarkan uang dalam kelipatan 5 USD. Untuk setiap transaksi, Eva akan
    dikenakan transaksi 0.5 USD.
    Buatlah program untuk menghitung saldo rekening Eva setelah dilakukan transaksi.

Spesifikasi Input :
    Satu baris berisi bilangan bulat jumlah uang yang akan diambil Eva dan bilangan riil yang
    berisi saldo di rekening Eva dengan 2 angka dibelakang koma.

Spesifikasi Output :
    Satu baris saldo rekening Eva setelah dikenakan transaksi, dengan dua angka dibelakang koma.
    Jika saldo rekening Eva tidak cukup untuk melakukan transaksi, keluarkan saldo rekening semula.
*/

fun main(){
    Utility.printTitle(char = '=', title = "Mesin ATM")
    // INPUTAN USER
    print("Masukan uang yang ingin diambil\t: ")
    val a = readlnOrNull()
    print("Masukan jumlah saldo awal\t: ")
    val b = readlnOrNull()

    // VALIDASI
    if (a != null && b != null){
        val uang = a.toFloatOrNull()
        val saldoAwal = b.toFloatOrNull()
        if (uang != null && saldoAwal != null && uang.toInt() % 5 == 0){
            val fee = 0.5
            val saldoAkhir = saldoAwal - uang - fee
            if (saldoAkhir < 0){
                println(String.format("%.2f", saldoAwal))
            } else {
                println(String.format("%.2f", saldoAkhir))
            }
        } else {
            println(String.format("%.2f", saldoAwal))
        }
    } else {
        println("Terjadi kesalahan dalam inputan.")
    }
}