import java.util.Scanner;

public class Siakad07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;
        
        // biodata
        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.println("Masukkan nomor absen: ");
        absen = sc.nextByte();

        // nilai
        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai UTS: ");
        nilaiUts = sc.nextDouble();
        System.out.println("Masukkan nilai UAS");
        nilaiUas = sc.nextDouble();
        
        // nilai akhir
        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15)  + (nilaiUts * 0.30) + (nilaiUas * 0.35);

        // data mahasiswa
        System.out.println("Nama: " + nama + " NIM " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        sc.close();
    }
}
