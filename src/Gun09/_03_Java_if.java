package Gun09;

import java.util.Scanner;

public class _03_Java_if {
    public static void main(String[] args) {

        //Girilen iki sayidan buyuk olanini degerini ekrana yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.print("1.sayi = " );
        int sayi1= oku.nextInt();
        System.out.print("2.sayi= "  );
        int sayi2= oku.nextInt();

        if(sayi1>sayi2)
            System.out.println("sayi1 buyuktur "+sayi1 );
        if(sayi1<sayi2) {//opsiyonel olan suslu parantezdir
            System.out.println("sayi2 buyuktur " + sayi2);
        }

            if (sayi1==sayi2)
            System.out.println(" sayi1 ve sayi2 esittir ");

    }
}
