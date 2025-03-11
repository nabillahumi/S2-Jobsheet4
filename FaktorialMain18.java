import java.util.Scanner;

public class FaktorialMain18 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();

        Faktorial18 fk = new Faktorial18();
        System.out.println("Nilai faktorial " + nilai+ " enggunakan BF : " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + " menggunakan DC : " + fk.faktorialDC(nilai));
    }
}
