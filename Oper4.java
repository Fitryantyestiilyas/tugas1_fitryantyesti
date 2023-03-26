/* Operator terner */
public class Oper4 {
public static void main(String[] args) {
// TODO Auto-generated method stub
/* KAMUS */

        System.out.println("NIM: 13020210035");
        System.out.println("NAMA: Fitry Antyesti Ilyas");
	System.out.println("Hari / Tanggal: Rabu / 09 Maret 2023");
	System.out.println("Waktu Pengerjaan : 10:23\n");
        
int i = 0; /* perhatikan int i,j=0 bukan seperti ini */
int j = 0;
char c = 8; char d = 10;
int e = (((int)c > (int)d) ? c: d);
int k = ((i>j) ? i: j);
/* ALGORITMA */
System.out.print ("Nilai e = "+ e); 
System.out.print ("\nNilai k = "+ k); 
i = 2;
j = 3;
k = ((i++>j++) ? i: j) ;
System.out.print ("\nNilai k = "+ k);

 }
}
