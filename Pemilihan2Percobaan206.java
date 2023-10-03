import java.util.Scanner;
public class Pemilihan2Percobaan206 {

    public static void main(String[] args) {

        Scanner input06 = new Scanner(System.in);

        System.out.print("Masukkan sudut 1: ");
        float sudut1 = input06.nextInt();

        System.out.print("Masukkan sudut 2: ");
        float sudut2 = input06.nextInt();

        System.out.print("Masukkan sudut 3: ");
        float sudut3 = input06.nextInt();

        float totalsudut = sudut1+sudut2+sudut3;

        if (totalsudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else {
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
            }
        } else {
            System.out.println("Bukan segitiga");
        }
    }
}