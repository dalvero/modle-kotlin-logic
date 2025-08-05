package logicOne

import consoleUtility.Utility

/*
Soal :
    Suatu benda dikatakan berwujud cair jika suhunya berada di kisaran 0 s.d. 100 °C.
    Selain itu, benda dikatakan berwujud non cair. Buatlah sebuah program untuk menentukan
    wujud suatu benda jika diketahui suhunya.

Spesifikasi Input :
    Satu baris berisi bilangan riil yang menunjukkan suhu benda (-150 ≤ suhu ≤ 150).

Spesifikasi Output :
    Satu baris berisi “berwujud cair” (tanpa tanda petik) jika benda berwujud cair,
    atau berisi “berwujud non cair” jika benda berwujud non cair.
*/

fun main(){
    Utility.printTitle(char = '=', title = "Wujud Beda")
    print("Masukan suhu benda (C)\t: ")
    val w = readlnOrNull()
    if (w != null){
        val suhu = w.toIntOrNull()
        if (suhu != null && suhu >= -150 && suhu <= 150){
            val result : String = if (suhu in 0..100){
                "cair."
            } else {
                "non cair."
            }
            println("Wujud benda anda adalah $result")
        }
    }
}