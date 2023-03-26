import java.util.Scanner;
/* contoh membaca integer menggunakan Class Scanner*/
 public class BacaData {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
        System.out.println("NIM: 13020210035");
        System.out.println("NAMA: Fitry Antyesti Ilyas");
	System.out.println("Hari / Tanggal: Rabu / 09 Maret 2023");
	System.out.println("Waktu Pengerjaan : 10:23\n");
int a;
Scanner masukan;
/* Program */
System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
masukan = new Scanner(System.in);
a = masukan.nextInt(); /* coba ketik : 
masukan.nextInt(); 
Apa akibatnya ?*/
System.out.print ("Nilai yang dibaca : "+ a );
System.out.println("\n");

}
 }