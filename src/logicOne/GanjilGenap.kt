package logicOne

import  consoleUtility.Utility

/*
Soal :
    Buatlah sebuah program untuk menentukan apakah suatu bilangan termasuk
    bilangan ganjil atau genap.

Spesifikasi Input :
    Satu baris berisi bilangan bulat X (0 < X < 100).

Spesifikasi Output :
    Satu baris berisi “ganjil” (tanpa tanda petik) jika X merupakan bilangan ganjil,
    atau “genap” jika X merupakan bilangan genap.
*/

fun main(){
    Utility.printTitle(char = '=', title = "Ganjil dan Genap")
    print("Masukan angka untuk diuji : ")
    val anom = readlnOrNull()

    if (anom != null){
        val number = anom.toIntOrNull()
        if (number != null && number > 0 && number < 100){
            val result: String
            if (number % 2 == 0){
                result = "Genap"
                print("Angka anda termasuk angka $result.")
            } else {
                result = "Ganjil"
                print("Angka anda termasuk angka $result.")
            }
        }
    }
}