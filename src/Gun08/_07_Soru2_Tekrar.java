package Gun08;

import java.util.Scanner;

public class _07_Soru2_Tekrar {
    public static void main(String[] args) {

        //kullanicinin girecegi 2 sayinin birbirine esitmi olup olmadiginiz yazdiriniz

        Scanner oku=new Scanner(System.in);

        System.out.print("1.sayi = " );
        int sayi1= oku.nextInt();

        System.out.print("2.sayi = " );
        int sayi2= oku.nextInt();

        System.out.println("esitmi = "  +(sayi1==sayi2));

    }
}
