package Gun12;

import java.util.Scanner;

public class _00_Tekrar {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("SAYI GIR = " );

        int sayi= oku.nextInt();

        int bolum=sayi/10;
        int onlarb=bolum%10;

        switch (onlarb) {
            case 0: System.out.println("ONLAR BASAMAGI=SIFIR" );break;
            case 1: System.out.println("ONLAR BASAMAGI=BIR" );break;
            case 2: System.out.println("ONLAR BASAMAGI=IKI" );break;
            case 3: System.out.println("ONLAR BASAMAGI=UC" );break;
            case 4: System.out.println("ONLAR BASAMAGI=DORT" );break;
            case 5: System.out.println("ONLAR BASAMAGI=BES" );break;
            case 6: System.out.println("ONLAR BASAMAGI=ALTI" );break;
            case 7: System.out.println("ONLAR BASAMAGI=YEDI" );break;
            case 8: System.out.println("ONLAR BASAMAGI=SEKIZ" );break;
            case 9: System.out.println("ONLAR BASAMAGI=DOKUZ" );break;
        }




















    }

















    }




