package Gun25._04_Soru_DigerCozum;


import java.util.ArrayList;
import java.util.Scanner;

public class orn {

    public static void main(String[] args) {
        // Ogretmen için not defteri programı yapılma isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri bir metodda yazdırınız.
        // sınıfın not ortalamasını yine bir metodda yazdırınız.
        // gerekli Class(lar) için ayrı dosya açınız

        ogr ogr11=new ogr();
        ArrayList<ogr> ogrnot=new ArrayList<>();
        notlarYaz(ogrnot);
        notlarokut(ogr11,ogrnot);
        ort(ogr11,ogrnot);


    }


    public static void notlarYaz(ArrayList<ogr> ogrnotlar){

        Scanner scan=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);

        for (int i = 0; i <2 ; i++) {
            ogr ogr2=new ogr();
            System.out.print("tam ad=");
            ogr2.tamAd=scanStr.nextLine();
            System.out.print("okul No=");
            ogr2.okulNo= scan.nextInt();
            System.out.print("not=");
            ogr2.notu= scan.nextInt();
            ogrnotlar.add(ogr2);
                    }
}

public static void notlarokut(ogr ogr1, ArrayList<ogr> ogrnotlar){
    Scanner scan=new Scanner(System.in);
    Scanner scanStr=new Scanner(System.in);
    for (int i = 0; i < ogrnotlar.size() ; i++) {

        System.out.println(ogrnotlar.get(i).tamAd);
        System.out.println(ogrnotlar.get(i).okulNo);
        System.out.println(ogrnotlar.get(i).notu);

    }
}

public static void ort(ogr ogr1, ArrayList<ogr>ogr2){
        int toplam=0;

    for (int i = 0; i <2 ; i++) {
toplam+=ogr2.get(i).notu;
    }
int ort=(toplam/2);
    System.out.println("ort="+ort);
}

}