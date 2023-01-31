package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {

        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("red");
        renkler.add("RED");
        renkler.add("green");

    //EKRANA YAZDIRMA
        System.out.println("renkler = " + renkler);

        //EKRANA TEK TEK NASIL YAZDIRIRIM   //sag tarafa dizinin kendisini yazdiririz sol tarafa tipini yazariz.
        //setlerde index kavrami yok,elemanlarin yerleri her zaman degistigi icin
        //foreach ile elemanlari tek tek yazdiririz ayni fori gibi calisir  each=herhangi biri
        //foreach de herhangi birini gonder.ornegin arabadan karpuzlari atmak herhangi bir karpuzu alip atmak gibi
        //foreach random aliyor.
        //foreachde sag tarafina dizinin kendisini yazariz(renkler)
        //foreachde sol tarafina attigimiz dizinin tipini ve tipe bir isim veririz
        //sag tarafindaki renkleri sol taraftaki elemanlara atmis olduk burdanda tek tek yazdirabiliriz
        //foreach i heryerde kullanabiliriz.dizilerde, dongulerde, arraylistlerde vs. sira garanti degil.

        for (String eleman: renkler) {  //sira garanti degil.kafasina gore siralar
            System.out.println("eleman = " + eleman);
        }
        // foreachle ilgili ornek olsun diye eklendi
        // int[] dizi={34,5,63,547,65,324234,63,436};
      //  for (int sayi:dizi) {
       //     System.out.println("sayi = " + sayi);
      //  }


        //set in kendi sirasi nasil ise onun aynisini verir
        Iterator gosterge= renkler.iterator();//orjinal sirasi nasil ise ona gore sirasini verir
                                              //hashset ise hashsete gore siralar linkedhashset ise linkedhashsete gore siralar treeset ise treesete gore siralar
        while(gosterge.hasNext())   //siradaki eleman var ise
        {

            System.out.println("gosterdigi eleman = " + gosterge.next());
            //.next gostergenin gosterdigi elemani temsil ediyor
        }



    }
}
