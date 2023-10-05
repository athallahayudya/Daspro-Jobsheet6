import java.util.Scanner;
/**
 * suhu06
 */
public class suhu06 {

    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        int suhu;
        String hujan;

        System.out.println("Masukkan suhu: ");
        suhu = input06.nextInt();

        System.out.println("Apakah cuaca hujan? (y/t)");
        hujan = input06.next();

        if (suhu > 27) {
            System.out.println("Memakai dress");

            if (hujan.equals("y")) {
                System.out.println("Membawa payung");
            } else {
                System.out.println("Memakai sunscreen");
            }
        } else {
            System.out.println("Memakai celana panjang");
        }
    }
}