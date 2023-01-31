package Gun12;

import java.util.Scanner;

public class _02_IfElseIf_Calculator {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanicidan alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("1. SAYI GIR= " );
        int sayi1= oku.nextInt();
        System.out.println("2.SAYI GIR = ");
        int sayi2= oku.nextInt();

        System.out.println("Toplama icin T ");
        System.out.println("Cikarma icin C");
        System.out.println("Bolme icin B" );
        System.out.println("Carpma icin C");
        Scanner okuStr=new Scanner(System.in);   //String icin ayri bir Scanner lazim
        System.out.print("islem = " );
        String islem=okuStr.nextLine();


       //MERDIVENLI IF, LADDER IF
        if (islem.equalsIgnoreCase("T"))
        System.out.println("TOPLA = "+(sayi1+sayi2) );
        else
        if (islem.equalsIgnoreCase("C"))
            System.out.println(" CIKAR= "+(sayi1-sayi2) );
        else
            if (islem.equalsIgnoreCase("B"))
                System.out.println("BOL = "+(sayi1/sayi2) );
            else
                if(islem.equalsIgnoreCase("P"))
                    System.out.println("CARP = "+(sayi1*sayi2) );
                else
                    System.out.println("HATA ");


                /* 2.COZUM
                Scanner oku=new Scanner(System.in);
        System.out.print("SAYI 1 GIR = ");
        int sayi1= oku.nextInt();
        System.out.print("SAYI 2 GIR = " );
        int sayi2= oku.nextInt();

        Scanner okuSTR=new Scanner(System.in);
        System.out.print("ISLEMINI BELIRT TOPLAMA ICIN+ CIKARMA ICIN - CARPMA ICIN * BOLME ICIN / = " );

        String islem=okuSTR.nextLine();

        if(islem.equals("+"))
            System.out.println("TOPLA = "+(sayi1+sayi2) );
        else
            if (islem.equals("-"))
                System.out.println("CIKAR="+(sayi1-sayi2) );
            else
                if (islem.equals("/"))
                    System.out.println("BOL = "+(sayi1/sayi2) );
                else
                    if (islem.equals("*"))
                        System.out.println("CARP ="+(sayi1*sayi2));
                    else
                        System.out.println("HATA" );

                 */




    }
}
