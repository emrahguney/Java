package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        //girilen bir sayinin, 2 ayni sayinin carpimina esit olup olmadigini bulunuz

        //4 girdim -> bu tam karedir(2*2)
        //5 girdim -> degildir
        //9 girdim -> 3*3

        Scanner oku=new Scanner(System.in);

        System.out.print("SAYI GIR = ");

        int sayi= oku.nextInt();
        int sayac=1;
        //5 girildi, 5 e kadar sayilari 1,2,3,4
        //9 girildi , 9 a kadar sayilari 1,2,3,4,5,6,7,8

        while(sayac<sayi) {
            System.out.println("sayac = " + sayac);
            if (sayac * sayac == sayi) {
                System.out.println(sayac + " SAYISI ILE TAM KAREDIR");
                break; //calistiginda donguden cikar. IF e bagli oldugu icin break i  if e bagladik
            } //{ VE } ISARETLERINI KOYMAZSAN sayac++ yi KABUL ETMEZ HATA VERIR sayac++
                sayac++;
        }
        if (sayac*sayac!=sayi)
            System.out.println("TAM KARE DEGILDIR" );

    }
}
//break: dongude belirtilen kosul saglandiginda akisi keser donguden cikar