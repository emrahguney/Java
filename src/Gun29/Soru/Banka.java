package Gun29.Soru;

public class Banka {
    public static void main(String[] args) {
        // Hesap (yatan(int), cekilen(int), bakiye(int))
        // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
        // Bir banka uygulaması için 1 müşteri tanımlayınız,
        // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
        // Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
        // bakiyeye direk para atanamadıgını kontrol ediniz.


        Musteri mus1=new Musteri();


        mus1.ad="EMRAH";
        mus1.soyad="GUNEY";
        mus1.hesapID=2546344;
        mus1.MusteriHesap.parayatirma(200);
        mus1.MusteriHesap.parayatirma(500);
        mus1.MusteriHesap.paracekme(200);
        mus1.MusteriHesap.islemsorgulama();

        System.out.println(mus1.MusteriHesap);
    }
}
