import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Array= ");
        int jumlah = input.nextInt();
        int[] arr = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Array " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        int hasil = 0;
        for (int i = 0; i < jumlah; i++) {
            hasil += arr[i];
        }

        System.out.println("Hasilnya adalah : " + hasil);
    }
}
