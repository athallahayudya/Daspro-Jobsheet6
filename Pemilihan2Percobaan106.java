import java.util.Scanner;
public class Pemilihan2Percobaan106 {

    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        System.out.print2("Masukkan tahun : ");
        int tahun = input06.nextInt();

        if ((tahun % 4) == 0) {
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}