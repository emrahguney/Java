package Gun06;

import java.util.Scanner;

public class _01_Ornek_Tekrar {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde
        // adres bilgisi alarak yazdırınız.
        Scanner oku=new Scanner(System.in);
        Scanner oku2=new Scanner(System.in);
        //String ve int gibi degerler gireceksen iki tane scanner olmasi lazim.String icin ayri bir scanner int icin ayri
        //bir scanner olmasi lazim cunku birbirini etkiliyolar tek scanner olsaydi String ulkeyi okumaz
        System.out.print("Cadde = " );
        String Cadde=oku.nextLine();
        System.out.print("Sokak = ");
        String Sokak= oku.nextLine();
        System.out.print("PostaKodu = " );
        int PostaKodu= oku2.nextInt();
        System.out.print("Ulke = " );
        String Ulke= oku.nextLine();
        System.out.println("Cadde;Sokak;PostaKodu;Ulke = "+Cadde+" "+Sokak+" "+PostaKodu+" "+Ulke );


    }
}
