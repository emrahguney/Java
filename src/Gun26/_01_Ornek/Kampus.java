package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp  yazdırınız.

        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1;
        ogr.tamAd="Emrah Guney";

        //1.yontem
        ogr.okulu=new Okul();   //direk okulu olarak yazamiyoruz o yuzden ilk  basta olusturmamiz,tanimlamamiz lazim
        ogr.okulu.adi="Beykoz Universitesi";
        ogr.okulu.mudurAdi="Unknown";
        ogr.okulu.ucreti=123.423;


        //2.yontem
        Okul ok=new Okul();
        ok.adi="Beykoz Universitesi";
        ok.mudurAdi="Unknown";
        ok.ucreti=123.423;
        ogr.okulu=ok;   //atama islemini yaptik,asagidakilerini yazdirabilmek icin

        System.out.println("okulNo = " + ogr.okulNo);
        System.out.println("tamAd = " + ogr.tamAd);
        System.out.println("ogr = " + ogr.okulu.adi);
        System.out.println("ogr.okulu.ucreti = " + ogr.okulu.ucreti);
        System.out.println("ogrmud = " + ogr.okulu.mudurAdi);
      //  System.out.println("ok = " + ok.adi);
       // System.out.println(ok.mudurAdi);
       // System.out.println(ok.ucreti);

        ogr.BilgiYazdir();

    }


}
