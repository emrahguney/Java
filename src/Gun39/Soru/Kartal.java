package Gun39.Soru;

public class Kartal extends Hayvan{
    public Kartal(String isim, boolean vahsi, String dogumtarihi) {
        super(isim, vahsi, dogumtarihi);
    }

    @Override
    public void yiyecegi() {
        System.out.println("hayvan avlayarak onlari yer");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("5-10 kg arasi et tuketir" );
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("8 saattir");
    }

    @Override
    public void sesi() {
        System.out.println("ne bileyim sesini");
    }
}
