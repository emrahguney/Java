package Gun08;

import java.util.Scanner;

public class _08_Soru3 {
    public static void main(String[] args) {
        //Girilen bir sayinin tek sayi olup olmadigini yazdiriniz
        Scanner sayac=new Scanner(System.in);

        System.out.print("sayi gir = " );
        int sayi=sayac.nextInt();

        int kalan=sayi%2; //bu 1 e esitse tekdir

        System.out.println("tek sayimi = " + (kalan==1));

        //2.yontem
        System.out.println("tekmi = " +(sayi%2==1) );
        //3.yontem
        System.out.println("tek mi = " +(sayi%2 !=0) );//negatif girilme ihtimali sebebi ile bu en dogru cunku bir ustte negatif girilirse -1 gelir



    }
}
