package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        // Ogretmen için not defteri programı yapılma isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri bir metodda yazdırınız.
        // sınıfın not ortalamasını yine bir metodda yazdırınız.
        // gerekli Class(lar) için ayrı dosya açınız
        
        Scanner okuSTR=new Scanner(System.in);
        Scanner okuINT=new Scanner(System.in);
        ArrayList<Ogrenci> snf=new ArrayList<>();

        for (int i = 0; i <2 ; i++) {
            
            Ogrenci ogr=new Ogrenci();//herbirinin yeni bir ogrenci olmasi icin her zaman burda yeni bir ogrenci tanimliyor oyuzden bunun dongunun icerisinde olmasi lazim

            System.out.print("Okul No=");ogr.okulNo=okuINT.nextInt();
            System.out.print("Tam Adi=");ogr.tamAdi=okuSTR.nextLine();
            System.out.println("Notu=");ogr.notu=okuINT.nextInt();
            
            snf.add(ogr); //arraylistin icine attik
            }
        
        bilgileriYazdir(snf);

        ortalamaYaz(snf);

    }
    public static void bilgileriYazdir(ArrayList<Ogrenci> asd){
        for (Ogrenci ogr: asd){         // indexler lazim degilse en kolay yazdirma yontemi foreachdir(i ler ile ugrasmassin)
            System.out.println("okul no="+ogr.okulNo);
            System.out.println("tam ad="+ogr.tamAdi);
            System.out.println("not="+ogr.notu);

            System.out.println();
        }

        
        
    }

    public static void ortalamaYaz(ArrayList<Ogrenci> zxc){
        
        int toplam=0;
        for (Ogrenci ogr:zxc){
            
            toplam=toplam+ ogr.notu;
        }
        System.out.println("ortalama = " + toplam/zxc.size());
    }
    
}