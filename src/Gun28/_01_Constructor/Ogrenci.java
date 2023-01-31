package Gun28._01_Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinifi;




    public  Ogrenci(){//yapici metodlar:Constructor metodlar //void eklemiyoruz bunlar yapici metodlar oldugu icin bunlarin sana birsey dondurme sanslari yok
    System.out.println("nesne olusturuldu" );

}//nesne olusturulurken yapmak istediklerin icin burayi kullan


public  Ogrenci(int id,String ad1,String soyad,int sinifi){//yapici

    this.id=id;//this.id:classin id si, id: local degisken parametre
    this.ad=ad1;
    this.soyad=soyad;
    this.sinifi=sinifi;
}

public Ogrenci (int id,String ad, String soyad){
    //kisa hali
    this(id,ad,soyad,0);    //this ogrenci metodunun kendisi
   // her yeni öğrenci ekleyeceğimizde parametreler aynı olduğu sürece yenisini eklemeyeceğiz bu sayede
   //parametre degisire yenisini ekleyecegiz

    //uzun hali
  //  this.id=id;
  //  this.ad=ad;
 //   this.soyad=soyad;
  //  this.sinifi=0;
}
}
//muhendisin arabayi cizdigi kagittaki modeller:class,tipin adi, turun adi
//buna bakarak yapilmis araba ise nesne, araba uretilirken yapilan islemlerin yapildigi
//metod ise Constructor yani yapici metodlar