package Gun34._01_Ornek;

public class Soru {
    public static void main(String[] args) {
        // 1- Arac isimli bir superclass olusturunuz, fields : renk, motorHacmi, marka olsun.
        // 2- Consructor ekleyiniz.get ve set metodları ve toString Metodunu ekleyiniz.
        // 3- Bu sınıftan  Otobus sınıfını üretiniz, otobusun ayrıca yolcuKapasitesi field ını ekleyiniz.
        // 4- Bir AracPark isimli içinde main olan bir sınıf olucturunuz ve Otobus ten
        //    nesne oluşturarak, Otobusun özelliklerinin tümünü ekrana yazdırınız.



        Otobus otobus=new Otobus("mavi",4000,"Volvo",60);
        System.out.println(otobus);
    }
}
