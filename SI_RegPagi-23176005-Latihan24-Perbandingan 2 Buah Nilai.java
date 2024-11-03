/**
 * Nama                 : Khaerul Adzkia Alamsyah
 * Nim                  : 23176005
 * Prodi                : Sistem Informasi / Semester 3
 * Mata Kuliah          : PBO 1 / Pertemuan 6 / Latihan 24 - Perbandingan 2 Buah Nilai
 * Deskripsi Program    : Program ini membandingkan dua nilai yang diinput oleh pengguna dan
                          menampilkan hasil perbandingannya.
 **/
package pertemuan.pkg6;
import java.util.Scanner;
public class Latihan24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;

        do {
            System.out.println("========Program Perbandingan Nilai========");
            
            // Input nilai pertama
            System.out.print("Masukkan nilai pertama : ");
            int nilaiPertama = scanner.nextInt();

            // Input nilai kedua
            System.out.print("Masukkan nilai kedua : ");
            int nilaiKedua = scanner.nextInt();

            // Bandingkan nilai
            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil : " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            // Tanya apakah ingin mengulangi
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            scanner.nextLine(); // consume newline left-over
            ulangi = scanner.nextLine();

        } while (ulangi.equalsIgnoreCase("Ya"));

        scanner.close();
    }
}


