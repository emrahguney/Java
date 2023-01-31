package Gun20;

import java.util.Scanner;

public class _00_ {
    public static void main(String[] args) {
        //Kullanicinin girecegi 2 sayinin toplamini bir fonksiyonda buldurup bunun sonucunu mainde yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("1. sayi gir");
        int sayi1= scan.nextInt();
        System.out.println("2.sayi gir=");
        int sayi2= scan.nextInt();

       int toplam= Rnd(sayi1,sayi2);
        System.out.println("toplam = " + toplam);

    }

    public static int Rnd(int a,int b){

        return  a*(int)(Math.random()*10)+b*(int)(Math.random()*10);

        
        
    }
}
