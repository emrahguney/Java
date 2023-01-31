package Gun02;

public class _03_Ornek2_Tekrar {
    public static void main(String[] args) {
        System.out.println("Merhaba Dunya"); /*yazdigimiz kodun ilk harfi buyukse buyuk yazilacak kucuk yazilirsa kabuledilmez.
                                    Kodun icerisindeki iki tane cift tirnak arasina herseyi aynen yazdirabilirsin
                                    istedigini yazar yani demek istedigi ben ekrana yazdiririm demek istiyor
                                    2 tane cift tirnak.
                                    Komutun sonundaki noktali virgul-> demek istedigi emrim bitti yerine getir anlamina
                                    gelir.komutun sonunda noktali virgul yoksa komut gecersiz olur.
                                    */
                            //a A -> insan icin ikiside a harfidir ama bilgisayar acisindan sanki a ile x mis gibi
                                       // yani bilgisayar iki harfide farkli okur.
                                        // Yukardaki komutta o yuzden buyuk harfle basliyor
        System.out.println("Merhaba Dunya 2");
        //yukardaki komutta println de ln var ise yazdiktan sonra alt satira gecer. ln(line)
        // Altta ornek verirsek ornek merhaba 1 merhaba 2

        System.out.print("merhaba 1");
        System.out.println(); // birsey yazmaz sadece yeni satir acar
        System.out.print("merhaba 2");
        System.out.println();
        System.out.println("Merhaba \nDunya"); // \n -> yeni satir acar ayni ln gibi
    }
}
