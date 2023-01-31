package Gun07;

import java.util.Scanner;

public class _06_Ornek_Tekrar {
    public static void main(String[] args) {
        //Tek seferde girilen bir ad soyadin adini ve soyadini ayirip ayri ayri yazdiriniz
        Scanner oku=new Scanner(System.in);
        System.out.print("AD VE SOYAD= " );
        String adSoyad= oku.nextLine();

        int bosluk=adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,bosluk);
        String soyad=adSoyad.substring(bosluk+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);

        //veya
        System.out.print("AD VE SOYAD = ");
        String adSoyad2= oku.nextLine();
        int bosluk2= adSoyad2.indexOf(" ");
        System.out.println("AD = "+adSoyad2.substring(0,bosluk) );
        System.out.println("SOYAD = " + adSoyad2.substring(bosluk+1));
    }
}
