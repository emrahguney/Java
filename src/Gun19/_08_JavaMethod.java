package Gun19;

import java.util.Arrays;

public class _08_JavaMethod {
    public static void main(String[] args) {

        // 20 elemanlı bir dizinin elemanlarını 100 kadar random sayılarla
        // bir fonksiyonda doldurunuz ve aynı fonksiyonda yazdırınız.
        // mainde 20 elemanlı bir diziyi tanımlayınız, daha sonra bir fonksiyona
        // göndererek random 100 e kadar olan sayılarla dodurunuz. ve aynı fonksiyonda
        // yazdırınız.

        int[] dizi=new int[20];     //int dizi[]=new int[20]; boylede yazilabilir


        rndsayilar(dizi);
        rndsayilaryazdir(dizi);
        System.out.println();
        rndsayitek(dizi);
        teksayilardizisi(dizi);

    }


    public static void rndsayilar(int []sayi/*aslinda int[] sayilar bu diziDoldurYazdir maininde int[] sayilar dir.yukardaki mainde int[]dizi dir*/){

        for (int i = 0; i < sayi.length ; i++) {
            sayi[i]=(int)(Math.random()*100);
        }

    }

    public static void rndsayilaryazdir(int []sayi){


        System.out.print(Arrays.toString(sayi)); //dizileri yazdirma islemi Arrays.toString(sayilar) yazmassan dizileri yazamazsin hataverir ozaman.


    }

    public static void rndsayitek(int[]sayi){
        int teksayi=0;
        for (int i = 0; i < sayi.length ; i++) {
            if (sayi[i]%2==1){
                teksayi++;
            }
        }
        System.out.println("teksayi adedi= " + teksayi);
    }


    public static void teksayilardizisi(int[] sayi){
        int teksayi=0;
        for (int i = 0; i < sayi.length ; i++) {
            if (sayi[i]%2==1){
                teksayi++;
            }
        }

        int tekler[]=new int[teksayi];
        int SAYI=0;
        for (int i = 0; i <sayi.length ; i++) {
            if (sayi[i]%2==1){
                tekler[SAYI]=sayi[i];
                SAYI++;
            }
        }
        System.out.println("tek sayili dizi="+Arrays.toString(tekler));


    }

    }

