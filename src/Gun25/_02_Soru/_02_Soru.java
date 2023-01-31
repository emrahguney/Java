package Gun25._02_Soru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.
        // Daha sonra 3 tane öğrenci bilgilerini kullanıcıdan alarak doldurunuz.


        Scanner okuSTR=new Scanner(System.in);
        Scanner okuINT =new Scanner(System.in);

        ArrayList<Ogrenci> sinif=new ArrayList<>();

        for (int i = 0; i <3 ; i++) {


            Ogrenci ogr = new Ogrenci();

            System.out.print("Ogrenci adi=");
            ogr.ad = okuSTR.nextLine();

            System.out.print("Ogrenci soyadi = ");
            ogr.soyad = okuSTR.nextLine();

            System.out.print(" sinif=");
            ogr.sinif = okuINT.nextInt();

            System.out.print("sube = ");
            ogr.sube = okuSTR.nextLine();

            System.out.print("adres = ");
            ogr.adres = okuSTR.nextLine();

            System.out.println();
            sinif.add(ogr);
        }
        for (Ogrenci ogrenciBILGISI:sinif) {

            System.out.println("ogrenci adi = " + ogrenciBILGISI.ad);
            System.out.println("ogr.soyad = " + ogrenciBILGISI.soyad);
            System.out.println("ogr.sinif = " + ogrenciBILGISI.sinif);
            System.out.println("ogr.sube = " + ogrenciBILGISI.sube);
            System.out.println("ogr.adres = " + ogrenciBILGISI.adres);
            System.out.println();

        }

        

}}
class Ogrenci{
//properties,field,ozellik
    String ad;
    String soyad;
    int sinif;
    String sube;
    String adres;


}