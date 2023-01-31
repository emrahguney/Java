package Gun32._03_Encapsulation._BenimCozum;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
        //  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
        //  3- Bütün fieldlar için encapsulation uygulayınız.
        //  4- okul isimli bir class tanımlayınız, fieldları okulAd, kontenjan,
        //     ArrayList cinsinden Öğrencileri olsun.
        //  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
        //  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar kullanıcıdan alarak
        //     öğrenci ekleyiniz. Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
        //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
        //  7- Öğrencilerin hepsine eşsiz bir ID ataması yapınız.

        OKUL okul=new OKUL("tepetarla",3);
        Scanner okuSTR=new Scanner(System.in);
        Scanner okuINT=new Scanner(System.in);

        do {
            System.out.println("adi="); String ad=okuSTR.nextLine();
            System.out.println("soyadi=");String soyad=okuSTR.nextLine();
            System.out.println("yasi=");int yas=okuINT.nextInt();
            if (yas<15) {System.out.println("15 yasindan kucuk oldugu icin kayit olamaz");}
            else {
                OGRENCI ogr=new OGRENCI(ad,soyad,yas);
                okul.getOgrenciler().add(ogr);}
        }while(okul.getOgrenciler().size()<okul.getKontenjan());


        System.out.println(okul.getOgrenciler());
    }
}
