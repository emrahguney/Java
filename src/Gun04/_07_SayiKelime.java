package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        // su ana kadar sayilari birbirine cevirdik
        //yazilarin rakamlara cevrilmesi ve rakamlarin yaziya cevrilmesi var

        String ad="emrah";
        String kelimeSayi="65"; // string halde, toplama gibi bir isleme giremez.Strin i integera cevircez

        int sayiDeger=Integer.parseInt(kelimeSayi);  //sayiya donusur // parseint cevirme manasina geliyor
                                                        //yani Integer.parseInt(kelimeSayi) bu kod
        // string olan bir seyi sayiya yani integer a cevir diyor. parseint anlami cevir manasina gelir
        //hangi string i cevirecegini parseintden sonra parantez icinde yazman lazim
        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        //toplam su anda int yani sayi, bunu String nasil donustururum

        String strToplam=Integer.toString(toplam); //String e donusturur

        System.out.println("strToplam = " + strToplam);
    }
}
