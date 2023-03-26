public class Oprator {
  public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */

        System.out.println("NIM: 13020210035");
        System.out.println("NAMA: Fitry Antyesti Ilyas");
	System.out.println("Hari / Tanggal: Rabu / 09 Maret 2023");
	System.out.println("Waktu Pengerjaan : 10:23\n");
        
boolean Bool1, Bool2, TF ; 
int i,j, hsl ;
float x,y,res;


    // Operasi boolean
    Bool1 = true;
    Bool2 = false;
    TF = Bool1 && Bool2;
    System.out.println("Bool1 && Bool2 = " + TF);
    TF = Bool1 || Bool2;
    System.out.println("Bool1 || Bool2 = " + TF);
    TF = !Bool1;
    System.out.println("!Bool1 = " + TF);
    TF = Bool1 ^ Bool2;
    System.out.println("Bool1 ^ Bool2 = " + TF);

    // Operasi numerik
    i = 5;
    j = 2;
    hsl = i + j;
    System.out.println("i + j = " + hsl);
    hsl = i - j;
    System.out.println("i - j = " + hsl);
    hsl = i / j;
    System.out.println("i / j = " + hsl);
    hsl = i * j;
    System.out.println("i * j = " + hsl);
    hsl = i / j;
    System.out.println("i / j (pembagian bulat) = " + hsl);
    hsl = i % j;
    System.out.println("i % j (sisa modulo) = " + hsl);

    // Operasi numerik (float)
    x = 5;
    y = 5;
    res = x + y;
    System.out.println("x + y = " + res);
    res = x - y;
    System.out.println("x - y = " + res);
    res = x / y;
    System.out.println("x / y = " + res);
    res = x * y;
    System.out.println("x * y = " + res);

    // Operasi relasional numerik
    TF = (i == j);
    System.out.println("i == j = " + TF);
    TF = (i != j);
    System.out.println("i != j = " + TF);
    TF = (i < j);
    System.out.println("i < j = " + TF);
    TF = (i > j);
    System.out.println("i > j = " + TF);
    TF = (i <= j);
    System.out.println("i <= j = " + TF);
    TF = (i >= j);
    System.out.println("i >= j = " + TF);

    // Operasi relasional numerik (float)
    TF = (x != y);
    System.out.println("x != y = " + TF);
    TF = (x < y);
    System.out.println("x < y = " + TF);
    TF = (x > y);
    System.out.println("x > y = " + TF);
    TF = (x <= y);
    System.out.println("x <= y = " + TF);
    TF = (x >= y);
    System.out.println("x >= y = " + TF);
  }
}
