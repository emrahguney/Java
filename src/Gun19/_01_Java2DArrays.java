package Gun19;

import java.util.Arrays;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        //int[][] tablo=new int[2][3];

        int[][] tablo={
                {3,4,55},
                {234,22,33,44},
                {22,31},
                {22,44,55,42,124},
                {33},
        };

        System.out.println("satir uzunlugu="+tablo.length); //5//satir sayisi
        System.out.println("0.satirin sutun uzunlugu="+tablo[0].length);    //3, sutun uzunlugu
        System.out.println("1.satirin sutun uzunlugu="+tablo[1].length);    //4, sutun uzunlugu
        System.out.println("2.satirin sutun uzunlugu="+tablo[2].length);    //2, sutun uzunlugu
        System.out.println("3.satirin sutun uzunlugu="+tablo[3].length);    //5, sutun uzunlugu
        System.out.println("4.satirin sutun uzunlugu="+tablo[4].length);    //1, sutun uzunlugu


        for (int i = 0; i < tablo.length; i++) {    // satir uzunlugu // kat

            for (int j = 0; j < tablo[i].length; j++) {    //ilgili satirdaki sutun uzunlugu //kattaki oda sayisi

                System.out.print(tablo[i][j]+"\t");


            }
            System.out.println();

        }
        System.out.println(Arrays.deepToString(tablo));//Arrays.deepToString 2D boyutlu diziler icin kullanilir
        //for dongusune gerek kalmiyor
    }
}
