package Gun17;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _01_JavaArray {
    public static void main(String[] args) {
// 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 0 atayınız  yazdırınız.

        int sayi[] =new int[50];

        for (int i = 0; i < sayi.length ; i++) {
            sayi[i]=(int)(Math.random()*11);
            System.out.println("dongu oncesi= "+sayi[i]);
        }
        System.out.println("***********************************************************************");
        for (int i = 0; i < sayi.length ; i++) {
            if (sayi[i]%2==0){
                System.out.println("dongu sonrasi "+sayi[i]+" sayisi = 0");}
            else  System.out.println("dongu sonrasi "+sayi[i]+" sayisi = 1");
        }

    }
}
/* int sayi[] =new int[10];

        for (int i = 0; i < sayi.length; i++) {
            sayi[i]=(int)(Math.random()*11);
            System.out.println("dongu oncesi="+sayi[i]);
        }

        for (int i = 0; i < sayi.length ; i++) {

            if (sayi[i]%2==1){
                sayi[i]=1;
                System.out.println("dongu sonrasi ="+sayi[i]);
            }
            else sayi[i]=0;
            System.out.println("dongu sonrasi = " +sayi[i] );

        }*/