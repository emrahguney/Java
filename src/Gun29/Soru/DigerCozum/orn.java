package Gun29.Soru.DigerCozum;


public class orn {

    public static void main(String[] args) {
// Hesap (yatan(int), cekilen(int), bakiye(int))
        // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
        // Bir banka uygulaması için 1 müşteri tanımlayınız,
        // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
        // Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
        // bakiyeye direk para atanamadıgını kontrol ediniz.



        musteri mus1=new musteri(31,"emrah","guney",new hesap(1000));

        mus1.getMusHesap().bakiyeniz();
        mus1.getMusHesap().cekilenpara(200);
        mus1.getMusHesap().yatan(400);
        mus1.getMusHesap().bakiyeniz();

        System.out.println();
        mus1.getMusHesap().cekilenpara(300);
        mus1.getMusHesap().yatan(100);
        mus1.getMusHesap().islemsorgu();


}
}
