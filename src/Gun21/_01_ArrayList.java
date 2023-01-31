package Gun21;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class _01_ArrayList {
    public static void main(String[] args) {
        //dizi, array : boyut sayisi belli, sonradan degistirilemez
        int[] dizi=new int[5];  // Array 5 elemanli boyutu sonradan degistirilemiyor

        //Boyutu dinamik olsun, eleman ekledikce uzasin, sildikce kisalsin
        //ArrayList: boyutunu basta vermene bile gerek yok, boyutu baslangicta 0
        //eleman ekledikce artar sildikce kisalir

        ArrayList<Integer> IList=new ArrayList<>();
        ArrayList<String> SList=new ArrayList<>();
        ArrayList<Double> DList=new ArrayList<>();

        /*  ArrayList<Double> DList=new ArrayList<>();
        DList.add(4.0);    double oldugunda 4 olarak direk atamazsin 4.0 olarak atayabilirsin     */

        //boylede kullanilabilir
        List<Integer> list=new ArrayList<>();  //bu sekildede tanimlayabiliriz. //Contents of collection 'list' are updated, but never queried(list, sariya boyanmisti bu yazilan cikiyordu yazdirinca sari boya gidiyor)
        list.add(4);
        System.out.println("list = " + list);

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Emrah"); //uzunluk 1
        isimler.add("Guney"); //uzunluk 2
        isimler.add("Gun"); //uzunluk 3
        isimler.add("asd"); //uzunluk 4
        isimler.add("Gun");

        System.out.println("isimler33 = " + isimler);
        System.out.println("isimler.size() = " + isimler.size()); //"isimler.size()" uzunlugu verir ayni lenght gibi

        System.out.println("isimler2 = " + isimler);
      //  isimler.add(1,"QQQQQQQ"); //VERILEN INDEX E EKLIYOR, D
     //   System.out.println("isimler = " + isimler);

     //   isimler.set(1,"XXXXXXXXXX"); //VERILEN INDEXDEKI ELEMANI DEGISTIRIR
     //   System.out.println("isimler = " + isimler);

     //   boolean varMI=isimler.contains("ASD");
    //    System.out.println("varMI = " + varMI);
     //   boolean varMI2=isimler.contains("Gun");
     //   System.out.println("varMI2 = " + varMI2);

      //  isimler.remove("XXXXXXXXXX"); // degere gore siler birden fazla varsa sadece ilkini siler
     // /  System.out.println("isimler = " + isimler);
//
       // isimler.remove(1);// rakam verildiginde index kabul ediyor ve ona gore siliyor
       // System.out.println("isimleremove = " + isimler);


       // isimler.remove("Gun");//rakam verildiginde index kabul ediyor ve ona gore siliyor
      //  System.out.println("isimler = " + isimler);

       // int indexofEmrah=isimler.indexOf("Emrah");
        //System.out.println("indexofEmrah = " + indexofEmrah);-> indexini verir

     //  String ilkEleman= isimler.get(0);    //verilen indexdeki degeri verir
     //   System.out.println("ilkEleman = " + ilkEleman);



     //  isimler.clear(); //herseyi temizliyor
      //  System.out.println("isimler = " + isimler);

    }
}
//Integer olsaydı remove(1) yapsaydık indeksi mi yoksa rakam olarak 1 i mi silerdi onun icin boyle yazilmasi lazim-> isimler.remove((Object)1); bunu yazarsak rakama gore siler
                                                                                                                                            //yukardaki index e gore siler