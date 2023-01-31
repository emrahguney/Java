package Gun23;

import java.util.HashSet;

public class _04_Sets {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);
        hs.add(3222);

        System.out.println("hs.size() = " + hs.size());

        hs.remove(5);   //elemanin kendi degerini siliyor

        System.out.println("remove sonrasi hs = " + hs);
        System.out.println("hs.size() = " + hs.size());

       if (hs.contains(3222)){
           System.out.println("var" );}
             System.out.println(hs.contains(7));


       hs.clear();  //butun elemanlari siliyor
        System.out.println("hs = " + hs);



    }
}
