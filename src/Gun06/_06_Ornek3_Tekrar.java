package Gun06;

import java.util.Scanner;

public class _06_Ornek3_Tekrar {
    public static void main(String[] args) {
        //Girilen bir ad soyadi"Emrah Guney" E.G seklinde yazdiriniz
        Scanner oku=new Scanner(System.in);

        //Girilen dedigine gore bir ad ve soyad girilecek oda string ile olur
        System.out.print("Ad ve soyad= " );//Kullanici ne girecegini bilsin diye ad ve soyad yazildi
        String AdSoyad= oku.nextLine();//ad ve soyad veri olarak alindi sisteme girildi

        //Emrah Guney->E.G->olmasi icin->E->charAt(0) olur  G->boslugu buluruz.boslugu buluruz boslugun indexi icin indexOf(" ") deriz
        char IlkHarf=AdSoyad.charAt(0);//E
        int BoslukIndex=AdSoyad.indexOf(" ");//boslugun indexi
        char soyadIlkHarf=AdSoyad.charAt(BoslukIndex+1);//G

        System.out.println("IlkHarf = " + IlkHarf);//ILK HARFI YAZDIR
        System.out.println("soyadIlkHarf = " + soyadIlkHarf);//SOYAD ILK HARFI YAZDIR
        System.out.println("ad ve soyad ilk harf="+IlkHarf +"."+ soyadIlkHarf+".");//SORUDA BOYLE OLMASI ISTENDI

    }
}
