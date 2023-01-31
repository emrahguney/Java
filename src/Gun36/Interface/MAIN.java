package Gun36.Interface;

public class MAIN {
    public static void main(String[] args) {
        HepsiBurada hb=new HepsiBurada();
        System.out.println("KS="+hb.KrediSkorunuGoster());
        hb.belgeleriImzalat();
        hb.bilgileriAl();
        hb.krediSecenekleriniGoster();
        hb.krediyiKullandir();
        hb.krediSkorunuKontrolEt();

        System.out.println(IMagaza.kredi());//interface de staticli metod olursa boyle yazilir

        hb.credit();//Interface de defaultlu yazilim

    }
}
