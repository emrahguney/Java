package Gun12;

import java.util.Scanner;

public class _06_Switch_Ornek {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        //Girilen bir sayinin onlar basamaginin degerini yazi ile yazdiriniz

        System.out.print("sayi gir = ");
        int sayi = oku.nextInt();

        int birlerBasamagi = sayi / 10;
        int onlarBasamagi = birlerBasamagi % 10;

        switch (onlarBasamagi) {
            case 0:
                System.out.println("SIFIR ");
                break;
            case 1:
                System.out.println("BIR");
                break;
            case 2:
                System.out.println("IKI");
                break;
            case 3:
                System.out.println("UC");
                break;
            case 4:
                System.out.println("DORT");
                break;
            case 5:
                System.out.println("BES");
                break;
            case 6:
                System.out.println("ALTI");
                break;
            case 7:
                System.out.println("YEDI");
                break;
            case 8:
                System.out.println("SEKIZ");
                break;
            case 9:
                System.out.println("DOKUZ");
                break;


        }
    }
}
