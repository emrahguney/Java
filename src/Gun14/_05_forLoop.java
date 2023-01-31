package Gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        //Girilen bir sayiya(dahil) kadar olan sayilarin carpimini bulunuz
        Scanner oku = new Scanner(System.in);

        System.out.print("sayi gir = ");
        int sayi = oku.nextInt();
        int toplam = 1;


        for (int i = 1; i <= sayi; i++) {
            toplam = (toplam * i);

        }
        System.out.println("toplam = " + toplam);
    }
}