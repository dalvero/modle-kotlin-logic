package logicFive

import consoleUtility.Utility

/*
Soal :
    Seorang petani buah memiliki perkebunan jeruk yang sangat luas. Setiap musim panen tiba, ratusan
    ton jeruk berhasil dipanen. Sebelum dijual, jeruk-jeruk tersebut terlebih dahulu diperiksa kualitasnya
    dan diberi label. Kualitas jeruk ditentukan berdasarkan penilain ahli dengan rentang nilai 0 - 100 (tanpa koma).

    Untuk jeruk dengan kualitas ekspor memiliki nilai dari 85 sampai 100, dan  diberi label huruf 'E',
    Untuk jeruk dengan kualitas lokal memiliki nilai dari 60 sampai 84,  dan diberi label 'L'
    Untuk jeruk kualitas rendah memiliki nilai kurang dari 60 sampai 0, dan diberi label 'R'.

    Buatlah program untuk menentukan kualitas jeruk serta hitung jumlah jeruk berdasarkan label jeruk
    dari sejumlah N jeruk yang diinputkan. Jika nilai yang diiputkan kurang dari 0 atau lebih dari 100,
    maka tampilkan "error"

Spesifikasi Input :
    Baris pertama diisi dengan  N  jumlah jeruk yang diinputkan dengan tipe integer  (0 < N < 200)
    Baris kedua diisi dengan P nilai jeruk bertipe integer sejumlah N yang dipisahkan oleh spasi (0 =< P <101)

Spesifikasi Output :
    Baris pertama menampilkan karakter 'E' serta jumlah jeruk dengan kualitas ekspor yang dipisahkan oleh spasi.
    Baris kedua menampilkan karakter 'L' serta jumlah jeruk dengan kualitas lokal yang dipisahkan oleh spasi.
    Baris ketiga menampilkan karakter 'R' sertaj umlah jeruk dengan kualitas rendah yang dipisahkan oleh spasi.
    Jika ada  salah satu nilai yang diiputkan kurang dari 0 atau lebih dari 100, maka tampilkan "error"
*/

fun main(){
    Utility.printTitle(char = '=', title = "Sortir Kualitas Jeruk")
    print("Masukan jumlah jeruk yang ingin disortir : ")
    val n = readlnOrNull()?.toIntOrNull() // VALIDASI NULL ATAU TIDAK, JIKA TIDAK DI CASTING KE INT

    // JIKA HASIL CASTING TIDAK NULL
    if (n != null && n > 0 && n < 200){
        // MEMBUAT ARRAY BERTIPE INT DENGAN PANJANG SESUAI n
        val daftarJeruk = IntArray(n)

        // INPUT DATA KE ARRAY
        for (i in 0..< n) {
            var inputKualitas: Int?
            var isValid = false
            do {
                print("Masukkan kualitas jeruk ke-${i + 1}: ")
                inputKualitas = readlnOrNull()?.toIntOrNull()
                // VALIDASI
                when (inputKualitas) {
                    null -> {
                        println("Input tidak valid. Silakan masukkan angka.")
                        isValid = false
                    }
                    in 0..100 -> {
                        isValid = true
                    }
                    else -> {
                        println("Input tidak valid. Silakan masukkan angka.")
                    }
                }
            } while (!isValid)

            if (inputKualitas != null) {
                daftarJeruk[i] = inputKualitas
            }
        }

        // VALIDASI
        /*
            Untuk jeruk dengan kualitas ekspor memiliki nilai dari 85 sampai 100, dan  diberi label huruf 'E',
            Untuk jeruk dengan kualitas lokal memiliki nilai dari 60 sampai 84,  dan diberi label 'L'
            Untuk jeruk kualitas rendah memiliki nilai kurang dari 60 sampai 0, dan diberi label 'R'.
        */

        val e = daftarJeruk.count { // KUALITAS EKSPOR
            it in 85..100
        }
        val l = daftarJeruk.count { // KUALITAS LOKAL
            it in 60..84
        }
        val r = daftarJeruk.count { // KUALITAS RENDAH
            it in 0..< 60
        }

        println("\nHasil Sortir Kualitas Jeruk :")
        println("Ekspor\t: $e")
        println("Lokal\t: $l")
        println("Rendah\t: $r")



    }



}
