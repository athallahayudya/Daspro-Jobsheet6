import java.util.Scanner;
public class Latihan206 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        int jmlBuku, hrgBuku, total;
        String jenisBuku;
        double diskon, diskonF, bayar;

        System.out.print("Masukkan Jenis Buku: ");
        jenisBuku = input06.nextLine();
        System.out.print("Masukkan Harga Buku: ");
        hrgBuku = input06.nextInt();
        System.out.print("Masukkan Jumlah Buku yang Dibeli: ");
        jmlBuku = input06.nextInt();
        System.out.println("===========================================");

        if(jenisBuku.equalsIgnoreCase("kamus")){
            if (jmlBuku > 2) {
                diskon = 0.12;
                System.out.println("Anda mendapatkan diskon sebesar 10% dan tambahan diskon 2%");
            } else {
                diskon = 0.1;
                System.out.println("Anda mendapatkan diskon sebesar 10%");
            }
            total = (jmlBuku*hrgBuku);
            System.out.println("Total harga belanjaan = "+total);
            diskonF = (total*diskon);
            System.out.println("Diskon yang Anda dapatkan = RP "+diskonF);
            bayar = (int) (total - (total*diskon));
            System.out.println("Jumlah yang harus dibayar adalah = RP "+bayar);
            System.out.println("=================================================");
        }else if(jenisBuku.equalsIgnoreCase("novel")){
            if (jmlBuku > 3) {
                diskon = 0.09;
                System.out.println("Anda mendapatkan diskon sebesar 7% dan tambahan diskon 2%");
            } else if(jmlBuku<= 3){
                diskon = 0.08;
                System.out.println("Anda mendapatkan diskon sebesar 7% dan tambahan diskon 1%");
            }else{
                diskon = 0.07;
                System.out.println("Anda mendapatkan diskon sebesar 7%");
            }
            total = (jmlBuku*hrgBuku);
            System.out.println("Total harga belanjaan = "+total);
            diskonF = (total*diskon);
            System.out.println("Diskon yang Anda dapatkan = RP "+diskonF);
            bayar = (int) (total - (total*diskon));
            System.out.println("Jumlah yang harus dibayar adalah = RP "+bayar);
            System.out.println("=================================================");
        }else if(jmlBuku>3){
            diskon = 0.05;
            total = (jmlBuku*hrgBuku);
            System.out.println("Total harga belanjaan = "+total);
            diskonF = (total*diskon);
            System.out.println("Diskon yang Anda dapatkan = RP "+diskonF);
            bayar = (int) (total - (total*diskon));
            System.out.println("Jumlah yang harus dibayar adalah = RP "+bayar);
            System.out.println("=================================================");
        }
        
    }
}
