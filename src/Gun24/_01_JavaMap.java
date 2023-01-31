package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        //Set-> HashSet, LinkedHashSet, TreeSet
        //Map-> HashMap, LinkedHashMap, TreeMap
        //Map=Anahtar+Set ->Anahtarli Set

        //anahtarin tipi Integer, degerinin tipi String olsun

                //KEY  ,  VALUE
        HashMap<Integer, String > hm=new HashMap<>();
        hm.put(1001,"Ismet Temur"); //1001 i cagirinca Ismet Temuru verir   //kendimize gore index veriyoruz,oda numarasini kendimiz veriyoruz
        hm.put(1002,"A");
        hm.put(1003,"B");
        hm.put(5202,"C");
        hm.put(5203,"C");
        hm.put(1002,"guney");   //ayni sayilar varsa en sonu alir, gunceller
        System.out.println("hm = " + hm);
//KEY E 1 DEN FAZLA ALABILIR VALUE 1 TANESINI ALIR ODA EN SON YAZILANI ALIR
        //KEY LERI FARKLI AMA VALUE LERI AYNI ISE IKISINIDE YAZAR
        //KEYLERI AYNI AMA VALUE LERI FARKLI ISE EN SON YAZILAN VALUE DEGERI YAZILIR
        System.out.println("hm.get = " + hm.get(1002)); //YAZDIRMAK ICIN KEY DEGERINI GIRMEMIZ LAZIM
        System.out.println("hm.get2 = " + hm.get(5202));


        System.out.println("hm.containsKey(1001) = " + hm.containsKey(1001));
        System.out.println("hm.containsValue(A) = " + hm.containsValue("A"));
        System.out.println("hm.containsValue(guney) = " + hm.containsValue("guney"));

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());
        System.out.println(" = " +hm.keySet()+hm.values());

        hm.remove(1003);
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());

        System.out.println("hm entryset= " + hm.entrySet()); //key ve valuesini  yazdirir


        hm.clear();
        System.out.println("hm = " + hm);


    }
}
