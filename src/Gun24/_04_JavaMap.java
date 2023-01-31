package Gun24;

import java.util.*;

public class _04_JavaMap {
    public static void main(String[] args) {


        Map<Integer, String> hm=new HashMap<>();    //MAP lerden HashMap
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"kopek");
        hm.put(11,"kus");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm);//hizli calismak icin, kendisine gore sira

        Map<Integer, String> lhm=new LinkedHashMap<>(); //MAP lerden LinkedHashMap
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"kopek");
        lhm.put(11,"kus");
        lhm.put(4,"kurt");
        System.out.println("lhm = " + lhm);//Eklendigi siraya gore sirali


        Map<Integer, String> thm=new TreeMap<>();   //MAP lerden TreeMap
        thm.put(9,"tilki");
        thm.put(2,"kedi");
        thm.put(30,"kopek");
        thm.put(11,"kus");
        thm.put(4,"kurt");
        System.out.println("thm = " + thm);//Herzaman sirali KEY e gore, kendinden sortlu



    }
}
