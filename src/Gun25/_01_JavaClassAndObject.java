package Gun25;

import java.util.ArrayList;
import java.util.Arrays;

class Ogrenci{

    String adi;
    String soyadi;
    int no;
    int yasi;
    double kilo;

}

//class-tiplerin tanimlandigi 2.yer

/** NOTLAR
 int sayi;    int tipi,   sayi değişkenin adı,

 int türünden bir sayı değişkeni
 eski nesil programlama
 yapısal programlama

 ----------------------------------------------------------------------
 yeni nesil programla -> Nesneye yönelik Programlama
 Object Oriented Progaramming -> OOP
 tip     nesne
 class   object
 Ogrenci ogr1= new Ogrenci();
 ogr1.Ad
 ogr1.Soyadi

 class Ogrenci{//Ogrenci tipinde bir degisken kullanacagiz artik
 String Adı
 String Soyadı
 int No
 String Adresi
 int Telefonu
 double kilo;
 */
//class=tip

public class _01_JavaClassAndObject {

    //metodlarin yazildigi yer
    public static void main(String[] args) {//basla
        //ana programin basladigi ve calistigi yer
        //bilgileri sadece mainde yazabiliriz classdan diger classa yazamayiz
        int sayi=5;
      //Scanner oku=new Scanner(); gibi dir  Scanner=Araba; oku=benimArabam
        Araba benimArabam=new Araba();  //Araba tur,tip adi,class adi; benimArabam nesne adi      //yeni bir class actiysak mutlaka mainde tanitmamiz lazim ondan sonra yazabiliyoruz
                                        //nesneleri herzaman new ile tanimlamamiz lazim
        benimArabam.renk="mavi";
        benimArabam.marka="VOLVO";
        benimArabam.motorHacmi=2000;
        benimArabam.yili=2004;

        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
        System.out.println("benimArabam.yili = " + benimArabam.yili);


        System.out.println("benimArabam = " + benimArabam);//classa toString metodunu kullanarak yazilir

        ArrayList<Araba> arabam=new ArrayList<>();
        arabam.add(benimArabam);
        System.out.println("arabam = " + arabam);

Ogrenci benimogrenci=new Ogrenci();
benimogrenci.adi="emrah";
benimogrenci.soyadi="guney";
benimogrenci.no=323;
benimogrenci.yasi=29;
benimogrenci.kilo=73.4;
        System.out.println("benimogrenci = " + benimogrenci.adi+" "+benimogrenci.soyadi+" "+benimogrenci.no+" "+benimogrenci.yasi+" "+benimogrenci.kilo);


        Oyunlar oyun1=new Oyunlar();
        oyun1.adi="Hearts of Iron 4";
        oyun1.turu="Strateji";
        oyun1.alanMiktari="15 GB";






    }//dur
    //metodlarin yazildigi yer


}
//class-tiplerin tanimlandigi yer

class Araba{
//KENDI TIPINI(String, int gibi) TANIMLA ONU KULLAN
    String renk;
    int yili;
    String marka;
    int motorHacmi;

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", yili=" + yili +
                ", marka='" + marka + '\'' +
                ", motorHacmi=" + motorHacmi +
                '}';
    }
}

class Oyunlar{
    String turu;
    String adi;
    String alanMiktari;
}

