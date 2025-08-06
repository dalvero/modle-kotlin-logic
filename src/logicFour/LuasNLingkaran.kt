package logicFour

import consoleUtility.Utility

/*
Soal :
    Menghitung Jumlah Luas N buah Lingkaran yang identik jika diketahui jari-jarinya.
    Gunakan Rumus: L = π × R2 , dengan L menunjukkan luas lingkaran, R menunjukkan jari-jari
    lingkaran, dan π bernilai 3,14.

Spesifikasi Input :
    Satu baris berisi bilangan riil R (0 < R ≤ 100) dan bilangan bulat N  (0 < N ≤ 50)

Spesifikasi Output :
    Satu baris berisi jumlah luas N-lingkaran dengan jari-jari R dan sebanyak N yang menjadi input,
    dengan dua angka di belakang koma.
 */

fun main(){
    Utility.printTitle(char = '=', title = "Luas N-Lingkaran")
    // INPUTAN USER
    print("Masukan jari-jari lingkaran\t: ")
    val r = readlnOrNull()
    print("Masukan jumlah lingkaran\t: ")
    val n = readlnOrNull()

    // VALIDASI
    if (r != null && n != null){
        val jariJari = r.toFloatOrNull()
        val nLingkaran = n.toFloatOrNull()
        if (jariJari != null && nLingkaran != null && jariJari > 0 && jariJari
            <= 100 && nLingkaran > 0 && nLingkaran <= 50){
            val luasLingkaran = 3.14 * jariJari * jariJari
            val jumlahLuasLingkaran = nLingkaran * luasLingkaran
            println("Jumlah luas lingkaran dengan jari jari $jariJari \nadalah ${String.format("%.2f", jumlahLuasLingkaran)}")
        }
    } else {
        println("Terjadi kesalahan pada inputan anda.")
    }

}