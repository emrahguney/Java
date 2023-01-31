package Gun24;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {

        HashMap<Integer, String > hm=new HashMap<>();
        hm.put(1001,"Ismet Temur"); //1001 i cagirinca Ismet Temuru verir
        hm.put(1002,"qwerty");
        hm.put(1003,"asdfgh");
        hm.put(5202,"zxcvbnm");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer K:hm.keySet())
        {
            System.out.println("keyleri = " + K);
        }

        System.out.println();


        for (String V:hm.values()) {
            System.out.println("value leri = " + V);
        }

        System.out.println();

       for (Map.Entry<Integer,String> kv: hm.entrySet()) {

           System.out.println(kv.getKey()+"-"+kv.getValue());

        }


    }
}
