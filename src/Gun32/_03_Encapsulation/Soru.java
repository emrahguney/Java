package Gun32._03_Encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru {
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
    public static void main(String[] args) {


        Scanner okuSTR=new Scanner(System.in);
        Scanner okuINT=new Scanner(System.in);

        Okul yeniOkul=new Okul("Kabataş Okulu", 3); // maxOgr 3

        do{
            System.out.println("ad = " ); String ad=okuSTR.nextLine();
            System.out.println("soyad=");String soyad=okuSTR.nextLine();
            System.out.println("yas=");int yas=okuINT.nextInt();
            if (yas<15){
                Ogrenci ogr=new Ogrenci(ad,soyad,yas);
                yeniOkul.getOgrenciler().add(ogr);

            }else {
                System.out.println("Ogrenci yasi okul icin uygun degil");
            }




        }while(yeniOkul.getOgrenciler().size() < yeniOkul.getKontenjan()    );

        System.out.println("yeniOkul.getOgrenciler() = " + yeniOkul.getOgrenciler());


    }
}
