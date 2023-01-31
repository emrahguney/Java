package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays_BUSORUYATEKRARBAK {
    public static void main(String[] args) {
        //3x2 lik bir diziyi kullanicidan sayi alarak doldurduktan sonra
        //sadece tek elemanlarini tek boyutlu bir diziye atayiniz.



        Scanner oku = new Scanner(System.in);

        int[][] tablo=new int[3][2];

        //burasi okuma islemi

        int tekMik=0;
        for (int i = 0; i < tablo.length ; i++) {
            for (int j = 0; j < tablo[i].length ; j++) {
                System.out.print("SAYI GIRINIZ = ");
                tablo[i][j]= oku.nextInt(); //SAYILARI OKUTTUK VE YAZDIRDIK

                if (tablo[i][j]%2 !=0)
                    tekMik++;       //TEK MIKTARINI BULDUK


            }

        }
        int[] teklerDizisi=new int[tekMik]; //teklerin miktari kadar bir dizi tanimlandi

      int teksayi=0;
        for (int satir = 0; satir < tablo.length ; satir++) {
            for (int sutun = 0; sutun < tablo[satir].length ; sutun++) {

                if(tablo[satir][sutun]%2!=0){

                    teklerDizisi[teksayi]=tablo[satir][sutun];
                    teksayi++;
                }

            }

        }
        for (int i = 0; i < teklerDizisi.length ; i++) {
            System.out.print(teklerDizisi[i]+" ");

        }











    }
}