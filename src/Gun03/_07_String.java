package Gun03;

public class _07_String {
    public static void main(String[] args) {

        String ad="Emrah";  //String: kelime veya kelimeleri saklamak icin kullanilir
                            //sinirlarini "" ile belirlenir. Burda kullanilan "" isareti kullanmayi unutma yoksa kabul olmaz kod
        String soyad="Guney";

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("ad ve soyad= " + ad + soyad); // + lar burada stringler arasinda oldugu icin birlestirir yani ekler
                                                            // + lar burada birlestirme gorevinde kullanilir.
        System.out.println("ad ve soyad= " +ad+"\t"+soyad); // bu orneklerde yazilan yesil renkteki yazilar birer bir string tir.

        //Gun04 Baslangici

        /*                  Burdaki cift tirnak arasina bir bosluk(space) birakilmalidir yoksa bitisik yazar
                              ^
                              | */
        String tamAd="Emrah"+" "+ "Guney";

        System.out.println("tamAd = " + tamAd);

        System.out.println("sayi="+6); //burdaki tirnak icindeki "sayi" kelimesi bir string tir
        //kodun icindeki yesil yazilar birer string tir.




    }
}
