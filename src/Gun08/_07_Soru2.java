package Gun08;


import java.util.Scanner;

public class _07_Soru2 {
    public static void main(String[] args) {

        //kullanicinin girecegi 2 sayinin birbirine esitmi olup olmadiginiz yazdiriniz
        Scanner oku=new Scanner(System.in);
        System.out.print(" sayi1= " );
        int sayi1= oku.nextInt();
        System.out.print(" sayi2= " );

        int sayi2= oku.nextInt();


        System.out.println("sayi1 sayi2 esitmi = " + (sayi1==sayi2));

        //2.yontem
        boolean esitMi=(sayi1==sayi2);
        System.out.println("esitMi = " + esitMi);
    }
}
