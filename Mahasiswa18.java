public class Mahasiswa18 {
    
    //attribut
    String nama;
    String NIM;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    //method konstruktor
    public Mahasiswa18(String nama, String NIM, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.NIM = NIM;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    // Atribut untuk menyimpan data mahasiswa dalam array
    static Mahasiswa18[] dataMahasiswa;

    // Konstruktor untuk menyimpan daftar mahasiswa
    public Mahasiswa18(Mahasiswa18[] dataMahasiswa) {
        Mahasiswa18.dataMahasiswa = dataMahasiswa;
    }

    // Metode mencari nilai UTS tertinggi dengan Divide and Conquer
    public static int cariNilaiUTSTertinggi(int left, int right) {
        if (left == right) {
            return dataMahasiswa[left].nilaiUTS;
        }
    
        int mid = (left + right) / 2;
        int lsum = cariNilaiUTSTertinggi(left, mid);
        int rsum = cariNilaiUTSTertinggi(mid + 1, right);
    
        return Math.max(lsum, rsum);
    }

    // Metode mencari nilai UTS terendah dengan Divide and Conquer
    public static int cariNilaiUTSTerendah(int left, int right) {
        if (left == right) {
            return dataMahasiswa[left].nilaiUTS;
        }
    
        int mid = (left + right) / 2;
        int lsum = cariNilaiUTSTerendah(left, mid);
        int rsum = cariNilaiUTSTerendah(mid + 1, right);
    
        return Math.min(lsum, rsum);
    }

    // Metode mencari rata-rata nilai UAS dengan Brute Force
    public static double rataUas() {
        double total = 0;
        for (Mahasiswa18 data : dataMahasiswa) {
            total += data.nilaiUAS;
        }
        return total / dataMahasiswa.length;
    }

}
