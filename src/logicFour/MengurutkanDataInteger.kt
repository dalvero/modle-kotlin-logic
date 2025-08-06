package logicFour

import consoleUtility.Utility

/*
Soal :
    Buatlah program untuk mengurutkan tiga data integer yang dimasukkan secara
    descending (dari besar ke kecil).

Spesifikasi Input :
    Satu baris berisi tiga buah bilangan bulat. Masing-masing bilangan bulat memiliki
    jangkauan nilai -300 ≤ data ≤ 300.

Spesifikasi Output :
    Satu baris berisi tiga buah bilangan bulat yang sudah terurut secara
    descending, dipisahkan oleh satu spasi.
*/

fun main(){
    Utility.printTitle(char = '=' ,title = "Mengurutkan Angka")

    // INPUT USER
    print("Masukkan tiga buah bilangan bulat (-300 s/d 300), \ndipisahkan oleh spasi : ")
    val inputBaris = readlnOrNull()

    if (inputBaris != null) {
        // PISAHKAN STRING INPUT MENJADI ANGKA INTEGER
        // mapNotNull DIGUNAKAN UNTUK MENGABAIKAN INPUT YANG BUkAN ANGKA
        val listAngka = inputBaris
            .split(" ")
            .mapNotNull { it.toIntOrNull() }

        // MEMERIKSA APAKAH INPUT VALID
        if (listAngka.size == 3) {
            val validasiRange = listAngka.all { it >= -300 && it <= 300 }
            if (validasiRange) {
                // MENGURUTKAN LIST SECARA DESCENDING
                val listTerurut = listAngka.sortedDescending()

                // MENCETAK OUTPUT SESUAI SPESIFIKASI
                val output = listTerurut.joinToString(" ")
                println("Data terurut : $output")
            } else {
                println("Inputan angka harus dalam jangkauan -300 s/d 300.")
            }
        } else {
            println("Inputan harus berisi tepat tiga buah bilangan bulat.")
        }
    } else {
        println("Tidak ada input yang diberikan.")
    }
}