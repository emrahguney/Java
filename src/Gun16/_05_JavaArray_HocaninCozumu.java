package Gun16;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class _05_JavaArray_HocaninCozumu {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz. trtr, kanald,atv,fox,habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.




        String[] tvler={"trt","atv","CCC","kanald","fox","BBB", "haberturk","AAA"};    //01234
        int rastgele=(int)(Math.random()* tvler.length);    //5 kadar 5 dahil degil

        System.out.println("RASTGELE SECILEN TV = " + tvler[rastgele]);


        //TODO:GUNUN SORUSU: BIR DONGU ILE 5 TANE RASTGELE BULDURUNUZ FAKAT BIR BULDUGUNU TEKRAR BULMASIN
//int rast[]=new int[tvler.length];

        HashSet<String> RAST=new HashSet<>();

        for (int i = 0; i < tvler.length ;i++) {
         //  rast[i]=(int)(Math.random()*tvler.length);



            RAST.add(tvler[(int)(Math.random()*(tvler.length))]);

            if (RAST.size()== tvler.length) break;
            else  i=0;
        }

        Iterator gosterge= RAST.iterator();
        while (gosterge.hasNext()){
            System.out.println("kanallar="+gosterge.next());
        }


     //   System.out.println("KANAL RASTGELE="+RAST);

/*String[] kanallar={"atv","TV8","CC","kanald","fox","AA","BB"};
        ArrayList<String> list =new ArrayList<>();
        for (int i = 0; i < kanallar.length; i+=0) {
            int random=(int)(Math.random()* kanallar.length);

            if(list.contains(kanallar[random])){
                continue;

            }
            else list.add(kanallar[random]);
            if (list.size()== kanallar.length) break;

        }
        System.out.println("list = " + list);*/







    }
}
