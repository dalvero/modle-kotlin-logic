package logicFive

import consoleUtility.Utility
import kotlin.math.pow

/*
Soal :
    Buatlah program untuk membuat pola seperti pada contoh input dan contoh output.

Spesifikasi Input :
    Satu baris berisi satu buah bilangan bulat N (1 ≤ N ≤ 10).

Spesifikasi Output :
    Pola berukuran N × N dengan pola seperti pada contoh output.
    Input   : 5
    Result  :   1
                2 1
                4 2 1
                8 4 2 1
                16 8 4 2 1
*/

fun main(){
    Utility.printTitle(char = '=', title = "Pola Angka")
    // INPUT USER
    print("Masukan ukuran pola\t: ")
    val n = readlnOrNull()

    // VALIDASI
    if (n != null){
        val ukuran = n.toIntOrNull()
        if (ukuran != null && ukuran >= 1 && ukuran <= 10){
            for (i in 0..< ukuran){
                for (j in 0 .. i){
                    // RUMUS POLA DENGAN PANGKAT i - j
                    val pangkat = (i - j).toDouble()
                    val nilai = 2.0.pow(pangkat).toInt()
                    print("$nilai ")
                }
                println()
            }
        }
    }
    Utility.printTitle(char = '=', title = "Selesai")
}