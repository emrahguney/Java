package Gun23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class _01_HashSet {
    public static void main(String[] args) {

        int sayi=5;                             //hafizada 1 sayi sakliyor
        int[] dizi=new int[6];                  //hafizada 6 sayi saklar; sabit boyutlu
        int[][] dizi2=new int[3][20];           // hafizada 60 sayi sakliyor 3x20;sabit boyutlu

        //dizi lazim ama boyutu ekledikce artsin sildikce azalsin
        ArrayList<Integer> liste=new ArrayList<>(); //boyu degisken

        ArrayList<ArrayList<Integer>> listelerinListesi=new ArrayList<>();  //2 boyutlu, 2 boyutuda degisken

        /* * **********************************************************************************************/

        //javadan oyle bir dizi isteyelimki; hem Arraylist gibi olsun, hemde TEKRAR degerleri icine almasin, oyle set isteyelim, yani dizi tip versin bize.

        //java SET ler adini verdigi diziler var dedi.

        //bir tanesi HASHSET->sen ekledikce hizli calismak icin kendine gore bir siralamada elemanlari tutar
        //LinkedHashSet->sen ekledikce EKLENME SIRASINA gore elemanlarini saklar
        //TreeSet-> sen ekledikce onlari herzaman SIRALI tutar .

        //bunlarin ortak ozelligi hic TEKRAR deger bulundurmaz.         //null degerde alabilir

        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(7);
        hs1.add(22);
        hs1.add(4);
       boolean EKLENDIMI= hs1.add(5);   //true
       boolean eklendimi= hs1.add(5);   //false
        hs1.add(2);
        hs1.add(8);
        //sirali olarak gosterebilir her zaman dogru siralama gostermez.siralamasina guvenme


        System.out.println("EKLENDIMI = " + EKLENDIMI);
        System.out.println("eklendimi = " + eklendimi);
        System.out.println("hs1 = " + hs1);


HashSet<HashSet<Integer> > HS1=new HashSet<>();

        HS1.add(hs1);
        System.out.println("HS1 = " + HS1);







    }
}
// Java cım, şu ana kadar verdiğin değişken tipleri için teşekkür ederim,
// fakat bana öyle bir dizi verki, hem ArrayList gibi olsun, hemde TEKRAR değerleri
// içine almasın, öyle set ver bana, yani dizi tip ver bana.
// Java mektubumuza cevap verdi :
// Sevgili Muhammed hiç canını sıkma , bu iş için tasarlanmış SET ler adını verdiğimiz
// dizilerimiz var dedi.
// HashSet -> sen ekledikçe hızlı çalışmak için kendine göre bir sıralamada elamanları tutar.
// LinkedHashSet -> sen ekledikçe , EKLENME SIRASINA göre , elemanlarını saklar.
// TreeSet -> sen ekledikçe onları herzaman SIRALI tutar dedi.
// bunların ortak özelliği Hiç TEKRAR değer bulundurmaz.