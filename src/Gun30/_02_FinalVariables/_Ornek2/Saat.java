package Gun30._02_FinalVariables._Ornek2;

public class Saat {

    final static int birGundekiSaatSayisi=24;
    final static int birSaatdekiDakSayisi=60;
    final static int birDakikadakiSanSayisi=60;


public static int hesapla(int gun, int saat, int dakika){

    int toplamSaniye=gun
            *Saat.birGundekiSaatSayisi
            *Saat.birSaatdekiDakSayisi
            *Saat.birDakikadakiSanSayisi
            +
            saat
                    *Saat.birSaatdekiDakSayisi
                    *Saat.birDakikadakiSanSayisi
            +
            dakika
                    *Saat.birDakikadakiSanSayisi;
    return toplamSaniye;


}

}
