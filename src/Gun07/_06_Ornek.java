package Gun07;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        //Tek seferde girilen bir ad soyadin adini ve soyadini ayirip ayri ayri yazdiriniz
        Scanner oku=new Scanner(System.in);
        System.out.print("AD VE SOYAD = " );
        String adSoyad= oku.nextLine();

        //EMRAH GUNEY, ALI KOC VB.
        //ad=0 boslugun indexine kadar
        //soyad=bosluk+1,sonuna kadar

        //2 isimli biri icin cozumu
        int boslukIndex=adSoyad.indexOf(" ");
        int boslukIndex2=adSoyad.lastIndexOf(" ");
        String ad=adSoyad.substring(0,boslukIndex);
        String ad2=adSoyad.substring(boslukIndex+1,boslukIndex2);
        String soyad=adSoyad.substring(boslukIndex2);  //2 indexi vermezsen sonuna kadar alir


        System.out.println("ad = " + ad);
        System.out.println("ad2 = " + ad2);
        System.out.println("soyad = " + soyad);




    }
}
