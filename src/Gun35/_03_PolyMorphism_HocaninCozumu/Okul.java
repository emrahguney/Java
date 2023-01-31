package Gun35._03_PolyMorphism_HocaninCozumu;

public class Okul {
    public static void main(String[] args) {
          /*
    1-Ogrenci isimli  ad , soyad, görevi , subesi olan bir class yazınız
    2-Calisan isimli  ad, soyad, görevi , departmanı olan bir sınıf yazınız.
    3-Yukarıdaki sınıflardan oluşturacağınız 2 adet nesne için de geçerli
    olacak kimlik belgesi formu oluşturan tek bir metod yazınız.
     */
        Ogrenci ogr1=new Ogrenci("zeynep nur","duvan","Ogrenci","5");
        Calisan cal1=new Calisan("Emrah","Guney","Tester","Bilisim");

        Kisi.yazdir(ogr1,cal1);

        Kisi.kimlikYaz(ogr1);
        Kisi.kimlikYaz(cal1);
    }
}
