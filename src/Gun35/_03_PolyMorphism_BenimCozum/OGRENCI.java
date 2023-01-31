package Gun35._03_PolyMorphism_BenimCozum;

public class OGRENCI extends KISI {
    private int subesi;

    public OGRENCI(String ad, String soyad, String gorevi) {
        super(ad, soyad, gorevi);
    }

    public OGRENCI(String ad, String soyad, String gorevi, int subesi) {
        super(ad, soyad, gorevi);
        setSubesi(subesi);
    }

    public int getSubesi() {
        return subesi;
    }

    public void setSubesi(int subesi) {
        this.subesi = subesi;
    }

    @Override
    public String toString() {
        return "OGRENCI{" +
                "subesi=" + subesi +
                "} " + super.toString();
    }
}
