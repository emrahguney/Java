package Gun27.Ornek1;

public class Utility {

    public  String getString(int sayi){//aslinda bu yok mainde new diyerek acarsan bu dunyaya gelmis gibi oluyor
                                        //nesneye ait

        return String.valueOf(sayi);
    }


    public static String getString2(int sayi){//bu bastan beri var olmus oluyor program calistigi andan itibaren var olmus oluyor
                                                //static metodlar class a ait

        return String.valueOf(sayi);
    }


    // STATIC olan methodlar SINIF a yani CLASS(public class Utility) yani TİP e ait geneli ilgilendiren

    // STATIC olmayanlar kime ait nesneye(public  String getString) ait bu sebeple mutlaka oluşturulmaları gerekiyor

    // Nesneyi ilgilendiren methodlar normal yazıyoruz.
    // Nesneyi ilgilendirmeyen, Tipi ilgilendiren
    // metodları STATIC ile yazıyoruz.

/**eger bir metod olusturulacak nesneler icin kullanilacaksa onda static kullanmiyoruz*/

/**ama bir metod olusturulacak nesneye ait degil herzaman
    direk kullanacagin metodlarsa(direk kullanabilecegin metodlarsa)
    o zaman onlar sinifa,class a aittir ve bunlari sinifin adiyla direk cagirabiliyorsun}**/

/** NESNEYE AIT METODLARI NORMAL YAZIYORUZ
 TIPI ILGILENDIRENI,NESNEYI ILGILENDIRMEYENI STATIC YAPIYORUZ
 */
}
