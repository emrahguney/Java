package Gun36.Interface6;

import java.util.Scanner;

public class GeoMain {
    public static void main(String[] args) {
      /*Kare, Dikdortken sınıflarından oluşacak bir geometri programı
yapılmak isteniyor.bunların ayrı ayrı , fakat ortak metodlarının
(cevresi() ve alani() )zorunlu olabilmesi için gerekli yapıyı kurunuz ve yazınız.
2 nesne için de main de değer vererek , sonuçlarını yazdırınız.*/
        Dikdortgen d=new Dikdortgen();
        System.out.println(d.cevre(4,5));
        System.out.println(d.alan(4,5));

        Kare k=new Kare();
        System.out.println(k.cevre(5));
        System.out.println(k.alan(5));

    }
}
