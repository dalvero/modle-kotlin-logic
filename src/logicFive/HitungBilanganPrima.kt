package logicFive

import consoleUtility.Utility
import kotlin.math.sqrt

/*
Soal :
    Dalam matematika, bilangan prima adalah bilangan asli yang lebih besar dari angka 1,
    yang faktor pembaginya adalah 1 dan bilangan itu sendiri.

    Diketahui sebuah array A dengan 10 elemen, hitunglah ada berapa bilangan prima
    pada array A tersebut.

Spesifikasi Input :
    Satu baris berisi 10 bilangan bulat A1, A2, ..., A10 (0 ≤ Ai ≤ 32.750).

Spesifikasi Output :
    Satu baris berisi bilangan bulat yang menyatakan jumlah kemunculan bilangan prima pada array A.
*/

fun main(){
    Utility.printTitle(char = '=', title = "Hitung Bilangan Prima")

    // INPUTAN USER
    print("Masukkan 10 bilangan yang \ndipisahkan oleh spasi : ")
    val n = readlnOrNull()

    // VALIDASI
    if (n != null){
        // MEMISAHKAN BILANGAN DAN KEMUDIAN DIMASUKAN KEDALAM LIST
        val listBilangan = n.split(" ").mapNotNull { it.toIntOrNull() }

        // VALIDASI APAKAH INPUTAN ADA 10 BILANGAN
        if (listBilangan.size == 10){
            // VALIDASI BILANGAN PRIMA ATAU TIDAK
            var countPrima = 0
            for (bil in listBilangan){
                if (isPrime(bil)){
                    countPrima++
                }
            }
            println("Jumlah bilangan prima yang ditemukan ada $countPrima")
        } else {
            println("Jumlah bilangan yang diinput harus tepat 10 bilangan.")
        }
    }

}

// FUNCTION UNTUK MENGECEK BILANGAN PRIMA ATAU TIDAK
fun isPrime(number: Int): Boolean {
    // 1. BILANGAN KURANG DARI ATAU SAMA DENGAN 1 BUKANLAH PRIMA
    if (number <= 1) {
        return false
    }

    // 2. BILANGAN 2 ADALAH PRIMA
    if (number == 2) {
        return true
    }

    // 3. BILANGAN GENAP SELAIN 2 BUKANLAH PRIMA
    if (number % 2 == 0) {
        return false
    }

    // 4. MENGECEK DARI 3 HINGGA AKAR KUADRATNYA, HANYA DENGAN ANGKA GANJIL
    //    MENGGUNAKAN STEP 2 UNTUK LOMPAT, KARENA SUDAH MENGECEK ANGKA GENAP
    val batas = sqrt(number.toDouble()).toInt()
    for (i in 3..batas step 2) {
        if (number % i == 0) {
            return false // DITEMUKAN FAKTOR PEMBAGI LAIN
        }
    }

    // JIKA TIDAK ADA FAKTOR PEMBAGI YANG DITEMUKAN MAKA IA ADALAH BILANGAN PRIMA
    return true
}