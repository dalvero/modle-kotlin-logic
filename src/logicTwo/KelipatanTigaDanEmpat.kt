package logicTwo

import consoleUtility.Utility

/*
Soal :
    Menentukan apakah suatu bilangan merupakan kelipatan 3 dan 4 atau tidak

Spesifikasi Input :
    Satu baris berisi bilangan bulat X (0 < X < 100).

Spesifikasi Output :
    Satu baris berisi nilai variabel cek.
*/

fun main(){
    Utility.printTitle(char = '=', title = "Kelipatan Tiga dan Empat")
    // INPUTAN
    print("Masukan bilangan anda\t: ")
    val a = readlnOrNull()

    // VALIDASI
    if (a != null){
        val bilangan = a.toIntOrNull()

        val cek : Int = if (bilangan != null && bilangan > 0 && bilangan < 100 && bilangan % 3 == 0 && bilangan % 4 == 0){
            1
        } else {
            0
        }
        println(cek)
    }  else {
        println("Bilangan tidak diketahui.")
    }


}
