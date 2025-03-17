import java.util.Scanner;

public class SumMain18 {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Masukkan jumlah elemen : ");
         int elemen = sc.nextInt();

         Sum18 sm = new Sum18(elemen);
         for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke- " + (i+1) + " : ");
            sm.keuntungan[i] = sc.nextDouble();
         }

         System.out.println("Total keuntungan menggunakan Bruteforce : " + sm.totalBF());
         System.out.println("Total keuntungan menggunakan Divide and Conquer : " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
