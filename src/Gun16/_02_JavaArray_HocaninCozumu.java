package Gun16;

import java.util.Scanner;

public class _02_JavaArray_HocaninCozumu {
    public static void main(String[] args) {
        int[] notlar = new int[5];
        Scanner oku = new Scanner(System.in);
        int toplam = 0;

        for (int i = 0; i < notlar.length; i++) {

            System.out.print("NOT GIR= ");
            notlar[i] = oku.nextInt();

            toplam = toplam + notlar[i];

        }
        int ort = toplam / notlar.length;
        int kalanlar=0;
        int gecenler = 0;
        for (int i = 0; i < notlar.length; i++) {

                if (notlar[i] > ort) {
                    System.out.println("ortalamadan buyuk notlar = " + notlar[i]);
                    gecenler++; }
                    else
                    kalanlar++;





        } System.out.println("ort = " + ort);
        System.out.println("gecenler = " + gecenler);
        System.out.println("kalanlar = " + kalanlar);


    }
}