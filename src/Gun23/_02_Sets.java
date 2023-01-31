package Gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        //Linked=baglanmis,baglantili,bagli

        //SETS
        //HashSet: Hizli, bunun icin kendine gore algoritmik sirada tutar
        //LinkedHashSet: EKLEME SIRASI na gore sirali tutar
        //TreeSet:  herzaman icinde SIRALI sekilde tutar, kendinden sortlu,harf sirasina gore siralar

        //Hizli, bunun icin kendine gore algoritmik sirada tutar

        HashSet<String> hs=new HashSet<>(); //kafasina gore siralar
        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dort");
        hs.add("bes");
        System.out.println("hs = " + hs);


        LinkedHashSet<String> lhs=new LinkedHashSet<>();    //ekleme sirasina gore siralar
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");
        System.out.println("lhs = " + lhs);

        TreeSet<String> ts=new TreeSet<>(); //harf sirasina gore siralar
        ts.add("bir");                      //ASKII tablosuna gore siralar buyuk kucuk harf ayrimida yapar
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        System.out.println("ts = " + ts);
    }
}
