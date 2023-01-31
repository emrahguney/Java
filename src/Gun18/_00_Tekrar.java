package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _00_Tekrar {
    public static void main(String[] args) {

        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.
Scanner scan=new Scanner(System.in);
        int dizi[][]=new int[2][3];

        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j < dizi[i].length ; j++) {
                System.out.print("sayi gir = ");
                dizi[i][j]= scan.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(dizi));


int enb=dizi[0][0];
        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j < dizi[i].length ; j++) {
               if (dizi[i][j]>=enb){
                   enb=dizi[i][j];
               }


            }
        }
        System.out.println("enb = " + enb);











    }
}
