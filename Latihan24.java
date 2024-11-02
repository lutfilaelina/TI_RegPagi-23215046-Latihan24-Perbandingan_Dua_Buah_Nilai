/*
 * @author 
 * NAMA     : Lutfi Laeli Nur Afiyah
 * KELAS    : Teknik Informatika 
 * NIM      : 23215046
 * Deskripsi Program : Perbandingan Dua Buah Nilai
 */ 

package Pertemuan6;
import java.util.Scanner;

public class Latihan24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulangi;  
        System.out.println("=========Program Perbandingan Nilai=========");

        do {//Penjelasan(1)
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = input.nextInt(); 

            System.out.print("Masukkan nilai kedua: "); 
            int nilaiKedua = input.nextInt();

            if (nilaiPertama > nilaiKedua) { //Penjelasan(2)
                System.out.println("Hasil: " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) { //Penjelasan(3)
                System.out.println("Hasil: " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else { //Penjelasan(3)
                System.out.println("Hasil: " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            System.out.print("\nUlangi Aktivitas? (Ya/Tidak): ");
            ulangi = input.next(); 
            System.out.println(""); 
        
        //Penjelasan(5)
        } while (ulangi.equalsIgnoreCase("Ya"));
    }
}

/*PENJELASAN 
  (1) Badan perulangan dalam do akan terus dicetak selama kondisi dalam while berisi "Ya"
      atau user setuju untuk mengulangi aktivitas pengecekan nilai tersebut.
  (2) Fungsi if akan mengecek apakah nilaiPertama lebih besar daripada nilaiKedua, jika true
      maka program akan mencetak keterangan bahwa nilaiPertama lebih besar dari nilaiKedua lalu 
      mengabaikan fungsi elseif atau else.
  (3) Jika pertanyaan if bernilai false, maka program akan membaca kondisi dalam else if. dan jika kondisi 
      tersebut bernilai true maka program akan mencetak keterangan bahwa nilaiPertama lebih kecil dari 
      nilaiKedua lalu mengabaikan else.
  (4) Namun apabila else if bernilai false, maka dapat dipastikan nilaiPertama dan nilaiKedua bernilai
      sama, jadi program akan mencetak fungsi else yang memberi keterangan bahwa nilaiPertama sama 
      dengan nilaiKedua.
  (5) Dalam kondisi while, saya sengaja menggunakan method equalsIgnoreCase() supaya program dapat 
      mengabaikan besar kecilnya huruf dalam input "Ya" yang dimasukkan user sehingga pengecekkan nilai
      dalam variabel ulangi dapat berjalan lebih efisien.
      Apabila user menulis input selain "Ya" maka otomatis perulangan akan berhenti dan program pengecekan
      dua nilai tersebut akan selesai. 
*/

