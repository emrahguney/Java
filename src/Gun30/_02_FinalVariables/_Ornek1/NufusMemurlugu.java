package Gun30._02_FinalVariables._Ornek1;

public class NufusMemurlugu {
    public static void main(String[] args) {

        Vatandas v1=new Vatandas("ismet");
        Vatandas v2=new Vatandas("nazmiye");
        Vatandas v3=new Vatandas("nurhayat");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        //v1.tcNo=456;
  /**        v1.isim="asd";
        final degiskenlerine sadece 1 kez veri atanabilir oda ya tanimlanirken yada constructorda*/

        //Math.PI; JAVANIN NASIL YAPTIGINA BAKTIK ODA BIZI GIBI YAPMIS

        System.out.println(Math.PI);
       double a= StrictMath.log(10);

    }
}
//final: deger atandiktan sonra degistirilmeyi engelliyor bu sebeple hem sabit degerler icin
        //hemde sonradan degismesini istemedigimiz degerler icin kullanilir
//static sayac ise her yeni nesne olusturuldugunda yeni artan deger almasini sagliyor