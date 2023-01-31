package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _05_Soru {
    public static void main(String[] args) {
        //10 elemanli bir diziyi random(10(dahil) a kadar olan sayilarla doldurduktan,tekrarli degerleri almayacak sekilde yeni bir diziye atiniz


        int dizi[]=new int[10];

        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]=(int)(Math.random()*11);


        }
        HashSet<Integer> hs1=new HashSet<>();
        for (int i = 0; i < dizi.length ; i++) {
            hs1.add(dizi[i]);
        }
        System.out.println(Arrays.toString(dizi));
        System.out.println("hs1 = " + hs1);

        //tekforlu
        /**
         int dizi[]=new int[10];
         HashSet<Integer> hs1=new HashSet<>();
         for (int i = 0; i < dizi.length ; i++) {
         dizi[i]=(int)(Math.random()*11);
         hs1.add(dizi[i]);}

         System.out.println(Arrays.toString(dizi));
         System.out.println("hs1 = " + hs1);

         **/
        //diger cozum yolu
       // HashSet<Integer> hs2=new HashSet<>(Arrays.asList(dizi));  //Integer dizi[]=new Integer[10]; basi boyle yapilirsa boylede cozulur

        //diger cozum yolu 2
       // HashSet<Integer> hs1 = new HashSet<>();
       // Collections.addAll(hs1,dizi);  ----------->    //Integer dizi[]=new Integer[10]; basi boyle yapilirsa boylede cozulur


    }
}
