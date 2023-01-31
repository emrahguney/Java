package Gun28._01_Constructor;

public class Okul {
    public static void main(String[] args) {


        //1.yol
        Ogrenci ogr1=new Ogrenci();//nesne olusma ani//() bu simge aslinda bir metod oldugunu gosteriyor, metodun isareti
        ogr1.id=1;  //ozelliklerinin degerlerini veriyorum
        ogr1.ad="ismet";
        ogr1.soyad="temur";
        ogr1.sinifi=5;
        System.out.println("ogr1.ad = " + ogr1.ad);
        //birinci oluşturdugumuz ogrenciyi constructorunu  ilk oluşturdugumuz nesne hata vermesin diye oluşturduk
        //2.yol
        Ogrenci ogr2=new Ogrenci(2,"emrah","guney",4);
        System.out.println("ogr2.ad = " + ogr2.ad);

        //3.yol
        Ogrenci ogr3=new Ogrenci(2,"erdem","buke");



    }
}
