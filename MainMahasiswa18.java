import java.util.Scanner;

public class MainMahasiswa18{
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner sc = new Scanner(System.in);

        //input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine();

        //deklarasi array mahasiswa
        Mahasiswa18[] dataMahasiswa = new Mahasiswa18[jumlahMahasiswa];

        //input data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("Nama\t\t : ");
            String nama = sc.nextLine();
            System.out.print("NIM\t\t : ");
            String NIM = sc.nextLine();
            System.out.print("Tahun Masuk\t : ");
            int tahunMasuk = sc.nextInt();
            System.out.print("Nilai UTS\t : ");
            int nilaiUTS = sc.nextInt();
            System.out.print("Nilai UAS\t : ");
            int nilaiUAS = sc.nextInt();
            sc.nextLine();

            dataMahasiswa[i] = new Mahasiswa18(nama, NIM, tahunMasuk, nilaiUTS, nilaiUAS);
            System.out.println("---------------------------------");
        }

        // Simpan data mahasiswa dalam atribut statis
        Mahasiswa18.dataMahasiswa = dataMahasiswa;

        // Pastikan jumlah mahasiswa lebih dari 0 sebelum pemanggilan metode
        if (jumlahMahasiswa > 0) {
            int utsTertinggi = Mahasiswa18.cariNilaiUTSTertinggi(0, jumlahMahasiswa - 1);
            int utsTerendah = Mahasiswa18.cariNilaiUTSTerendah(0, jumlahMahasiswa - 1);
            double rataUAS = Mahasiswa18.rataUas();

            // Menampilkan hasil
            System.out.println("\n===== Hasil Perhitungan =====");
            System.out.println("Nilai UTS Tertinggi : " + utsTertinggi);
            System.out.println("Nilai UTS Terendah  : " + utsTerendah);
            System.out.println("Rata-rata Nilai UAS : " + rataUAS);
        } else {
            System.out.println("Tidak ada mahasiswa yang dimasukkan.");
        }

    }

}