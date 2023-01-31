package Gun18;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.
        Scanner oku=new Scanner(System.in);
        int[][] tablo=new int[2][3];
//tabloyu okutma
        for (int i = 0; i < tablo.length ; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print("sayi gir = ");
                tablo[i][j] = oku.nextInt();

            }
            System.out.println();
        }
//tabloyu yazdirma
        for (int i = 0; i < tablo.length ; i++) {
            for (int k = 0; k < tablo[i].length ; k++){

                System.out.print(tablo[i][k]+",");

            }
            System.out.println();
        }



//en buyuk sayiyi bulma
        int enb=tablo[0][0];
        for (int j = 0; j < tablo.length ; j++) {
            for (int k = 0; k < tablo[j].length ; k++) {
                if (tablo[j][k]>=tablo[0][0])
                    enb=tablo[j][k];

            }

        }
        System.out.println("enb = " + enb);


    }
}
