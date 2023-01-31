package Gun03;

public class _01_Degiskenler_Tekrar {
    public static void main(String[] args) {

        /*DEGISKEN TANIMLAMA KURALLARI
        -Anahtar ve sakli sozcukler ad olamaz. Yani javaya ait kelimeleri kullanamazsin mesela int int kullanamazsin
        degisken isimleri kendin verebilirsin
        -Baslangicta adlar ya bir harf ile baslamali yada $ simgesi veya _ simgesiyle  baslamalidir.Rakam ile baslayamazsin
        rakam ile baslayacaksan basinda _ yada $ isareti olmasi lazim.Baska ozel karakterler kullanilmaz
        -Ilk harften sonrakiler harf rakam $ simgesi yada _ simgesi olabilir
        -javada adlar buyuk kucuk harf ayrimina duyarlidir.Yani java sayi ile Sayiyi farkli algilar.
        yani a ve z gibidirler diyebiliriz.
        bir tane daha ornek verirsek int Sayi ile int sayI da farklidir.Farkli algilanmamasi icin her kelimesi ve
        buyuklugu kucuklugu ayni olmak zorundadir.
        -Turkce karakterler kullanilmaz
        -ad icinde bosluk karakteri olamaz. Ornek; int sayi toplamlari olamaz. int sayitoplamlari olur.alt cizgi koyabilirsin
         mesela int sayi_toplamlari
          -int 1not,2not ->yanlis not1,not2->dogru
          */

        int sayi; // bana int miktarinca bir tam sayi saklayacagim bir yer ayir adini "sayi" verdim
        sayi=5;  // Suan sayiya 5 degerini verdim.Daha ekrana yazdirmadim. Simdi yazdirmak istersen asagidaki kodu girmeliyim

        System.out.println("sayi"); //bu kodda sadece sayi kelimesini yazar
        System.out.println(sayi); // bu kodda sadece sayiya verdigimiz degerini yazar
        System.out.println("sayi ="+sayi); //sayi=5 yazar. Koddaki + isareti ekle anlamindadir

        System.out.print("sayi=");
        System.out.println(sayi);



    }
}
