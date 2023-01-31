package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı(sayı) bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye(ArrayList) atayarak
        // yazdırınız.

        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[6];


            for (int j = 0; j < dizi.length; j++) {
                System.out.print("sayi gir=");
                dizi[j] = oku.nextInt();



                }
        System.out.println("dizi="+Arrays.toString(dizi)); // DIZIYI YAZDIRMA ISLEMI

        ArrayList<Integer> tekler = new ArrayList<>();

                for (int j = 0; j < dizi.length; j++) {
                    if (dizi[j] % 2 == 1)
                        tekler.add(dizi[j]);



                }
        System.out.println("TEKLER = " + tekler);




        }
    }
