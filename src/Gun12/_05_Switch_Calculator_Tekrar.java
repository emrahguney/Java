package Gun12;

import java.util.Scanner;

public class _05_Switch_Calculator_Tekrar {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T yada +, Çıkarma için Ç yada -, çarpma için P yada *, bölme için B yada /
        // harflerini yine kullanicidan alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner okuInt=new Scanner(System.in);
        System.out.print("1.sayi gir = ");
        int sayi1= okuInt.nextInt();
        System.out.print("2.sayi gir = ");
        int sayi2=okuInt.nextInt();

        System.out.println("ISLEMINI BELIRT (TOPLAMA ICIN +, CIKARTMA ICIN -, BOLME ICIN /, CARPMA ICIN *) = " );
        Scanner okuStr=new Scanner(System.in);
        String islem=okuStr.nextLine();

        switch(islem){
            case "+":
                System.out.println("TOPLAMA = "+(sayi1+sayi2) );break;

            case "-":
                System.out.println("CIKARMA = "+(sayi1-sayi2) );break;
            case "/":
                System.out.println("BOLME = "+(sayi1/sayi2) );break;
            case"*":
                System.out.println("CARPMA = " +(sayi1*sayi2));break;
            default:
                System.out.println("HATA" );



        }
    }
}