package logicFive

import consoleUtility.Utility

/*
Soal :
    Buatlah program untuk memeriksa apakah sebuah blok yang ada di permainan sudoku valid atau tidak.
    Blok tersebut dinyatakan valid jika setiap angka hanya muncul satu kali (unik). Sudoku merupakan
    sebuah permainan blok 3x3, dimana setiap kotak berisikan angka antara 1 hingga 9 dan tidak boleh
    ada angka yang berulang.

Spesifikasi Input :
    Tiga baris berisi elemen-elemen dari blok sudoku, di mana setiap elemen merupakan bilangan bulat
    yang dipisahkan oleh spasi dalam satu barisnya.

Spesifikasi Output :
    Satu baris berisi “valid” jika blok sudoku valid, atau “tidak valid” jika blok sudoku tidak valid.

*/

fun main(){
    Utility.printTitle(char = '=', title = "Memeriksa Blok Sudoku")
    // MEMBACA TIGA BARIS INPUT DAN MENGGABUNGKANNYA KE DALAM SATU List<Int>
    val inputBaris1 = readlnOrNull()
    val inputBaris2 = readlnOrNull()
    val inputBaris3 = readlnOrNull()

    // MEMERIKSA APAKAH SEMUA INPUT ADA
    if (inputBaris1 == null || inputBaris2 == null || inputBaris3 == null) {
        println("tidak valid")
        return // KELUAR DARI PROGRAM JIKA INPUT TIDAK LENGKAP
    }

    // MENGGABUNGKAN DAN MENGURAI SEMUA INPUT MENJADI SATU List<Int>
    val listAngka = (
            inputBaris1.split(" ").mapNotNull { it.toIntOrNull() } +
                    inputBaris2.split(" ").mapNotNull { it.toIntOrNull() } +
                    inputBaris3.split(" ").mapNotNull { it.toIntOrNull() }
            )

    // MEMERIKSA KONDISI VALIDITAS BLOK SUDOKU
    val isJumlahElemenSembilan = listAngka.size == 9
    val isAngkaDalamJangkauan = listAngka.all { it in 1..9 }
    val isAngkaUnik = listAngka.size == listAngka.toSet().size

    // MENENTUKAN OUTPUT BERDASARKAN SEMUA KONDISI
    if (isJumlahElemenSembilan && isAngkaDalamJangkauan && isAngkaUnik) {
        println("valid")
    } else {
        println("tidak valid")
    }
}