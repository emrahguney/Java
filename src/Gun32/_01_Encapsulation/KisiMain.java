package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {

        Kisi kisi1=new Kisi();
      //  kisi1.ad="Ismet";
       // kisi1.soyad="Temur";
      //  kisi1.yas=-25;

        kisi1.setAd("Ismet");
        kisi1.setSoyad("temur");
        kisi1.yasAta(-25);
       // kisi1.yasver();

        System.out.println("kisi1.yasver() = " + kisi1.yasver());
        System.out.println("kisi1.getAd() = " + kisi1.getAd());
        System.out.println("kisi1.getSoyad() = " + kisi1.getSoyad());





        System.out.println("kisi = " + kisi1);
        //degiskene direk erisimi kapatip bir metod ile korumali veri gonderme ve alma
        //islemine Encapsulation(Kapsulleme) denir

    }
}
