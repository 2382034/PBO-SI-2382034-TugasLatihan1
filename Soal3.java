import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan tulisan (camelCase): ");
        String kata = input.nextLine();
        int jumlahKata = 1;
        for (int i = 0; i < kata.length(); i++) {
            if (Character.isUpperCase(kata.charAt(i))) {
                jumlahKata++;
            }
        }
        System.out.println("Jumlah camelCase nya adalah= " + jumlahKata);
    }
}
