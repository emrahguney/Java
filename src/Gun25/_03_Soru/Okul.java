package Gun25._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {

        ArrayList<Ogrenci> sinif=new ArrayList<>();
        Scanner okuSTR=new Scanner(System.in);
        Scanner okuINT=new Scanner(System.in);


        for (int i = 0; i <3 ; i++) {


            Ogrenci ogr=new Ogrenci();
            System.out.print("Ogrenci adi=");ogr.ad = okuSTR.nextLine();
            System.out.print("Ogrenci soyadi = ");ogr.soyad = okuSTR.nextLine();
            System.out.print(" sinif=");ogr.sinif = okuINT.nextInt();
            System.out.print("sube = ");ogr.sube = okuSTR.nextLine();
            System.out.print("adres = ");ogr.adres = okuSTR.nextLine();
            System.out.println();
            sinif.add(ogr);
        }
        for (Ogrenci ogrenci:sinif) {

            System.out.println("ogrenci adi = " + ogrenci.ad);
            System.out.println("ogr.soyad = " + ogrenci.soyad);
            System.out.println("ogr.sinif = " + ogrenci.sinif);
            System.out.println("ogr.sube = " + ogrenci.sube);
            System.out.println("ogr.adres = " + ogrenci.adres);
            System.out.println();
        }

    }



}
