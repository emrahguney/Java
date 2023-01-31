package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde
        // adres bilgisi alarak yazdırınız.
        Scanner okustr=new Scanner(System.in); //String okumalarini yap
        Scanner okuint=new Scanner(System.in); //int okumalarini yap

        System.out.print("Cadde= " );//Kullanici ekrana ne gircegini anlamasi icin// Sayi girsende bi sikinti olmaz 23 Nisan caddesi yazsanda okur
        String Cadde=okustr.nextLine();

        System.out.print("Sokak= " );//Kullanici ekrana ne gircegini anlamasi icin
        String Sokak= okustr.nextLine();

        System.out.print("Posta kodu = " );//Kullanici ekrana ne gircegini anlamasi icin
        int postakodu= okuint.nextInt();

        System.out.print("Ulke=" );//Kullanici ekrana ne gircegini anlamasi icin
        String Ulke= okustr.nextLine();

        System.out.println("Cadde = " + Cadde);
        System.out.println("Sokak = " + Sokak);
        System.out.println("postakodu = " + postakodu);
        System.out.println("Ulke = " + Ulke);
        System.out.println("Cadde;Sokak;Posta Kodu;Ulke = " +Cadde+" "+Sokak+" "+postakodu+" "+Ulke );

    }
}
