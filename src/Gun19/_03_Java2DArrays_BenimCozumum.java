package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays_BenimCozumum {
    public static void main(String[] args) {

        int dizi[][]=new int[2][3];
        int tek=0;
        Scanner oku=new Scanner(System.in);
        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j < dizi[i].length ; j++) {
                System.out.print("sayi gir = " );
                dizi[i][j]= oku.nextInt();
                if (dizi[i][j]%2==1)
                    tek++;
            }
        }

          System.out.println("dizi yazdirma"+ Arrays.deepToString(dizi) );

        int tekdizi[]=new int[tek];

        tek=0;
        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j < dizi[i].length ; j++) {

                if (dizi[i][j]%2==1){
                    tekdizi[tek]=dizi[i][j];
                    tek++;}


            }

        }
        for (int i = 0; i <tekdizi.length ; i++) {
            System.out.print(tekdizi[i]+" ");

        }






    }
}
