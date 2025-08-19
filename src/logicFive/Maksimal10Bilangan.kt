package logicFive

import consoleUtility.Utility

/*
Soal :
    Buatlah sebuah program untuk menentukan bilangan terbesar dari sepuluh bilangan
    yang ada di dalam array 1 dimensi bertipe integer.

Spesifikasi Input :
    Satu baris berisi 10 buah bilangan integer.

Spesifikasi Output :
    Satu baris berisi bilangan bulat yang menyatakan nilai maksimal dari array tersebut.
*/

fun main(){
    Utility.printTitle(char = '=' ,title = "Maksimal dari 10 Bilangan")

    // INPUTAN USER
    print("Masukkan 10 bilangan yang \ndipisahkan oleh spasi : ")
    val n = readlnOrNull()

    // VALIDASI
    if (n != null){
        // MEMISAHKAN BILANGAN DAN KEMUDIAN DIMASUKAN KEDALAM LIST
        val listBilangan = n.split(" ").mapNotNull { it.toIntOrNull() }

        // VALIDASI APAKAH INPUTAN ADA 10 BILANGAN
        if (listBilangan.size == 10){
            // MENGAMBIL BILANGAN MAXIMAL
            val maxBilangan = listBilangan.max()
            println(maxBilangan)
        } else {
            println("Jumlah bilangan yang diinput harus tepat 10 bilangan.")
        }
    } else {
        println("Terjadi kesalahan pada inputan anda.")
    }
}
