import java.util.Scanner;
public class Modif2ArrayNilai24 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah mahasiswa : ");
    int jumlahMhs = sc.nextInt();
    int [] nilaiMhs = new int [jumlahMhs];
    double totalLulus = 0, totalGagal = 0;
    double rata2Lulus = 0, rata2Gagal = 0;
    int lulus = 0, gagal = 0;
    for (int i= 0;i < jumlahMhs; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
        nilaiMhs [i] = sc.nextInt();
        if (nilaiMhs [i] > 70) {
            totalLulus += nilaiMhs [i];
            lulus++;
        }
        else {
            totalGagal += nilaiMhs [i];
            gagal++;
        }
    }
    rata2Lulus = totalLulus/lulus;
    rata2Gagal = totalGagal/gagal;
    System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
    System.out.println("Rata-rata nilai tidak lulus = " + rata2Gagal);
    }
}
