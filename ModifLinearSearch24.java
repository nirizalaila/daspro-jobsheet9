import java.util.Scanner;
public class ModifLinearSearch24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array : ");
        int jumlahElemen = sc.nextInt();
        int [] arrayInt = new int [jumlahElemen];
        int key;
        int hasil = 0;

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen array ke-" + i + " : ");
            arrayInt [i] = sc.nextInt();
            }
        
        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < jumlahElemen; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println("Key berada di indeks ke-" + hasil);
    }
}
