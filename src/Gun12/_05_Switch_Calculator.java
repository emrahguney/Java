package Gun12;

import java.util.Scanner;

public class _05_Switch_Calculator {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        System.out.print("1.sayi = ");
        int s1= oku.nextInt();
        System.out.print("2.sayi = " );
        int s2= oku.nextInt();

        System.out.println("Toplama icin T ");
        System.out.println("Cikarma icin C");
        System.out.println("Bolme icin B");
        System.out.println("Carpma icin P");

        System.out.print("secimin = " );
        String secim=okuStr.next();

        switch (secim.toUpperCase())
        {
            case "T":
                System.out.println("topla = " +(s1+s2));break;
            case"C":
                System.out.println("cikar="+(s1-s2));break;
            case"B":
                System.out.println("bol = "+(s1/s2) );break;
            case"P":
                    System.out.println("carp = "+(s1*s2) );break;
            default:
                System.out.println("HATA");
        }


        }
    }
