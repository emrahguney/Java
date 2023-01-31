package Gun11;

import java.util.Scanner;

public class _09_JavaRandom_HocaninYaptigiCozum {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Uretilecek sayi siniri =" );
        int sinir= oku.nextInt();

        int tutulanSayi=(int)(Math.random()*sinir); //>>>> once int e cevirirsek sonuc 0 verir
        //buraya kadar bilgisayar sayiyi kendisi tuttu

        //simdi bizim tahmin ettecegimiz sayiyi girme zamani
        System.out.print("Tahmininiz = ");
        int tahmin= oku.nextInt();

        if (tahmin==tutulanSayi)
            System.out.print("TEBRIKLER ");
        else
            System.out.print("BILEMEDIN");
    }
}
