package Gun42;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {
      //ilkel tipler(primitive tipler)=short,byte,long,float,double,boolean

        //Referans tipler,
        int[]dizi={1,2,3,4,5};
      int[] dizi2={6,7,8};
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
        dizi=dizi2;
        System.out.println("dizi = " + Arrays.toString(dizi));//6,7,8
        System.out.println("dizi2 = " + Arrays.toString(dizi2));//6,7,8

        dizi[0]=231;
        System.out.println("dizi = " + Arrays.toString(dizi));//231,7,8
        System.out.println("dizi2 = " + Arrays.toString(dizi2));//231,7,8

        dizi2[0]=418;
        System.out.println("dizi = " + Arrays.toString(dizi));//418,7,8
        System.out.println("dizi2 = " + Arrays.toString(dizi2));//418,7,8



        //Nesne Tipler: NULL alabilen ilkel tip
        //String , Integer, Double, Long



        String ad1="mehmet";
        String ad2="ismet";
        //Referans ama davranisi ilkel

        ad1=ad2;
        System.out.println("ad1 = " + ad1);//ismet farkli kutucuk
        System.out.println("ad2 = " + ad2);//ismet farkli kutucuk

        ad1="Ali";
        System.out.println("ad1 = " + ad1);//Ali
        System.out.println("ad2 = " + ad2);//ismet

        String ad3=new String("Emrah");
        System.out.println("ad3 = " + ad3);

    }
}
