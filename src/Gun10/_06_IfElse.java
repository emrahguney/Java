package Gun10;


import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku=new Scanner(System.in);
        System.out.println("SIFRE GIR" );
        String sifre= oku.nextLine();
        int uzunluk=sifre.length();
        boolean varMi=sifre.toLowerCase().contains("pass");

        if ( sifre.length()>=8 && sifre.length()<=12 && sifre.toLowerCase().contains("pass")==false)
        System.out.println("UYGUN" );
        else
            System.out.println("UYGUN DEGIL" );

        //2.YONTEM
        if ( sifre.length()>=8 && sifre.length()<=12 && varMi==false)
            System.out.println("UYGUN" );
        else
            System.out.println("UYGUN DEGIL" );

        //3.YONTEM
        if (sifre.length()>=8 && sifre.length() <=12 && !sifre.toLowerCase().contains("pass"))
            System.out.println("UYGUN");
        else
            System.out.println("UYGUN DEGIL" );

       //4.YONTEM
        System.out.println(sifre.length()>8 &&sifre.length()<12 && !sifre.contains("pass") ?"uygun" :"uygun degil");


    }

}
