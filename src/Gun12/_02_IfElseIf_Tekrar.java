package Gun12;

import java.util.Scanner;

public class _02_IfElseIf_Tekrar {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanicidan alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner okuInt=new Scanner(System.in);
        System.out.print("1.sayi gir = " );
        int sayi1= okuInt.nextInt();
        System.out.print("2.sayi gir=");
        int sayi2= okuInt.nextInt();

        System.out.println("Toplama icin +" );
        System.out.println("Cikarma icin -");
        System.out.println("Bolme icin / " );
        System.out.println("Carpma icin *" );

        Scanner okuStr=new Scanner(System.in);
        System.out.print("Islem icin karakter gir = " );
        String islem=okuStr.nextLine();

        if (islem.equals("+"))
        System.out.println("TOPLAM = "+(sayi1+sayi2) );
        else
            if (islem.equals("-"))
        System.out.println("CIKARMA = "+(sayi1-sayi2) );
            else
                if (islem.equals("/"))
                    System.out.println("BOLME = "+(sayi1/sayi2) );
                else
                    if (islem.equals("*"))
                        System.out.println("CARPMA = "+(sayi1*sayi2));
                    else
                        System.out.println("HATALI ISLEM");
    }
}
