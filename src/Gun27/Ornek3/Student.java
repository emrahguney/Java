package Gun27.Ornek3;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Student {
    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri=new ArrayList<>();
    /*Lesson ders1;
        Lesson ders2;
        Lesson ders3;  //arraylist ile yapmasaydik boyle yazardik kod kalabaligi olurdu
    */

    public void dersEkle(Lesson ders){//propertiesleri(usttekiler ) kullandigi icin normal metoddur. KULLANMASAYDI STATIC YAPABILIRDIK AMA KULLANDIGIMIZ ICIN STATIC YAPAMAYIZ
        int suAnToplamSaat=0;
        for (Lesson d: dersleri)
            suAnToplamSaat+=d.saat;
        if (suAnToplamSaat+ ders.saat<=maxSaat)
            dersleri.add(ders);//ders in icinde hem saat hemde name i var ikisini birlikte arrayliste ekleniyor
        else
            System.out.println("Kredinizi astiniz.Yeni ders eklenememektedir.Eklenemeyen ders"+ders.name);
    }

    public void dersleriYazdir(){

        System.out.println("\n*** Transkript ***");
        System.out.println("Sayin "+name);
        System.out.println("Aldiginiz dersler asagidadir." );

        for (Lesson d: dersleri)
            System.out.println(d.name+" "+d.saat);

    }
    public static void UniversiteKurallari(){
        System.out.println("Kural 1: Caysiz ve uzumsuz derse gelme");
        System.out.println("Kural 2: Uykunu mutlaka al, saglik en onemlisi");
        System.out.println("Kural 3: Herzaman dinc ve dinamik ol ve pozitif ol");
        System.out.println("Kural 4: Başta verdiğini kararı UNUTMA!");
        System.out.println("Kural 5 : Biz imkansızlıkları, inş aşacağız");
    }
}
