package Gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123
        System.out.println("sayilari gir = ");

        String sayilar=oku.nextLine();  //ILK BASTA BU SAYILAR STRING DIR
        int bosluk=sayilar.indexOf(" ");
        int bosluk2=sayilar.lastIndexOf(" ");


        int Sayi1=Integer.parseInt(sayilar.substring(0,bosluk));
        int Sayi2=Integer.parseInt(sayilar.substring(bosluk+1,bosluk2));
        int Sayi3=Integer.parseInt(sayilar.substring(bosluk2+1));

        int toplam=Sayi1+Sayi2+Sayi3;

        if (toplam%2==0)
            System.out.println("CIFT" );
        else
            System.out.println("TEK ");
        /* Scanner oku= new Scanner(System.in);
        System.out.print("3 sayi gir=" );

        String sayilar= oku.nextLine();

        int bosluk=sayilar.indexOf(" ");
        int bosluk2=sayilar.lastIndexOf(" ");

        String sayi1=sayilar.substring(0,bosluk);
        String sayi2=sayilar.substring(bosluk+1,bosluk2);
        String sayi3=sayilar.substring(bosluk2+1);

        int SAYI1=Integer.parseInt(sayilar.substring(0,bosluk));
        int SAYI2=Integer.parseInt(sayilar.substring(bosluk+1,bosluk2));
        int SAYI3=Integer.parseInt(sayilar.substring(bosluk2+1));

        int toplam=SAYI1+SAYI2+SAYI3;

        if (toplam%2==0)
        System.out.println("CIFT" );
        else
        System.out.println(" TEK" );    */


    }
}
