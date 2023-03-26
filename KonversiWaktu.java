import java.util.Scanner;
public class KonversiWaktu {
    public static void main(String[] args) {
        // Tampilkan informasi NIM dan nama
        System.out.println("NIM: 13020210035");
        System.out.println("NAMA: Fitry Antyesti Ilyas");
		System.out.println("Hari / Tanggal: Rabu / 08 Maret 2023");
		System.out.println("Waktu Pengerjaan : 19:50\n"); 
		
        Scanner input = new Scanner(System.in);

        // Langkah 1: Masukkan total detik
        System.out.print("Masukkan total detik: ");
        long totalDetik = input.nextLong();

        // Langkah 2: Hitung detikSekarang
        long detikSekarang = totalDetik % 60;

        // Langkah 3: Hitung totalMenit
        long totalMenit = totalDetik / 60;

        // Langkah 4: Hitung menitSekarang
        long menitSekarang = totalMenit % 60;

        // Langkah 5: Hitung totalJam
        long totalJam = totalMenit / 60;

        // Langkah 6: Hitung jamSekarang
        long jamSekarang = totalJam % 24;

        // Langkah 7: Tampil waktu
        System.out.printf("Waktu saat ini adalah %02d:%02d:%02d", jamSekarang, menitSekarang, detikSekarang);

        input.close();
    }
}