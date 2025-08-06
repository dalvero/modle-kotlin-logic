package logicFour

import consoleUtility.Utility

/*
Soal :
    Buatlah program untuk membuat pola seperti pada contoh input dan contoh output.

Spesifikasi Input :
    Satu baris berisi satu buah bilangan bulat N (1 ≤ N ≤ 10).

Spesifikasi Output :
    Pola berukuran N × N dengan pola seperti pada contoh output.

For example:
        Input	Result
        5
        *
        * *
        * * *
        * * * *
        * * * * *
*/

fun main(){
    Utility.printTitle(char = '=', title = "Pola Segitiga")
    // INPUT USER
    print("Masukan ukuran segitiga\t: ")
    val n = readlnOrNull()

    // VALIDASI
    if (n != null){
        val ukuran = n.toIntOrNull()
        if (ukuran != null && ukuran >= 1 && ukuran <= 10){
            for (i in 0..< ukuran){
                for (j in 0 .. i){
                    print("* ")
                }
                println()
            }
        }
    }


}