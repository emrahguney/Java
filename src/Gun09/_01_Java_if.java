package Gun09;

import java.util.Scanner;

public class _01_Java_if {
    public static void main(String[] args) {
        //Algoritmadaki baklava dili javadaki if gibidir---Baklava dilimi->if

        //Girilen bir 10 dan buyuk ise ekrana 10 dan buyuk yazdiriniz.
        /*Algoritma
        1-Basla {
        2-sayi oku sayi=oku.nexInt()
        3-sayi>10 ise "10 dan buyuk " yaz ->if (sayi>10) sout...
        4-Dur
        */

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi gir = ");
        int sayi = oku.nextInt();

        if (sayi > 10) //normal parantezler sart      if(sayi>10);-> ; koyarsan challenger i patlatirsin koyma!
        {//if sarti saglandiginda yapilacaklarin parantezi if 1 tane varsa koymana gerek yok 1 den fazla varsa koymalisin
            System.out.println(" 10 dan buyuk ");
            //if in icinde birden fazla komut var ise if parantezleri sarttir
        }






        }
    }

