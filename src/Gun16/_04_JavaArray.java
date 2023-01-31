package Gun16;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
// Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

             Scanner oku = new Scanner(System.in);
            int[] notlar = new int[7];

            int toplam=0;

            for (int i = 0; i < notlar.length; i++) {

                System.out.print("NOT GIR= ");
                notlar[i] = oku.nextInt();

                toplam = toplam + notlar[i];

            }
            int ort = toplam / notlar.length;

            int gecenler = 0;
            for (int i = 0; i < notlar.length; i++) {

                    if (notlar[i] > ort && notlar[i]%2!=0) {
                        System.out.println("ortalamadan buyuk notlar = " + notlar[i]);
                        gecenler++;
                    }
                }
                System.out.println("ort = " + ort);
                System.out.println("gecenler = " + gecenler);







       /* Scanner oku=new Scanner(System.in);
        int[] sayi=new int[7];
        int ortalama;
        int toplam=0;
        int ortbuyuktek=0;
        for (int i = 0; i < sayi.length ; i++) {
            System.out.print("sayi gir = " );
            sayi[i]= oku.nextInt();
            toplam=toplam+sayi[i];




        }ortalama=(toplam/ sayi.length);

        for (int i = 0; i <sayi.length ; i++) {

            if (sayi[i]>ortalama && sayi[i]%2==1)
            {System.out.println("tek ve ortalamadan buyuk = "+sayi[i]);
                ortbuyuktek++;}

        }
        System.out.println("ortbuyuktek = " + ortbuyuktek);*/



    }
}




