package Gun39.Soru;

public class Kedi extends Hayvan {
    public Kedi(String isim, boolean vahsi, String dogumtarihi) {
        super(isim, vahsi, dogumtarihi);
    }

    @Override
    public void yiyecegi() {
        System.out.println("kediler mama ile beslenir");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("2 kap miktari yeterlidir ");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("kediler buyuyunce uyku sureleri 12 saatten fazla olabilir");
    }

    @Override
    public void sesi() {
        System.out.println("Miyav");
    }


}
