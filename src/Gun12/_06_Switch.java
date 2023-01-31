package Gun12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        //Girilen bir sayinin birler basamaginin degerini yazi ile yazdiriniz
        System.out.println("SAYI GIR = ");
        int sayi = oku.nextInt();

        int birlerbasamagi = sayi % 10;

        switch (birlerbasamagi) {
            case 0:
                System.out.println("SIFIR");break;
            case 1:
                System.out.println("BIR");break;
            case 2:
                System.out.println("IKI");break;
            case 3:
                System.out.println("UC");break;
            case 4:
                System.out.println("DORT");break;
            case 5:
                System.out.println("BES");break;
            case 6:
                System.out.println("ALTI");break;
            case 7:
                System.out.println("YEDI");break;
            case 8:
                System.out.println("SEKIZ");break;
            case 9:
                System.out.println("DOKUZ");break;


        }
    }
}