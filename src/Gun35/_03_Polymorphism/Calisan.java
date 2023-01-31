package Gun35._03_Polymorphism;

public class Calisan extends Ogrenci{

    private String departman;

    public Calisan(String ad, String soyad, String gorevi,String departman) {
        super(ad, soyad, gorevi);
        setDepartman(departman);
    }

    public Calisan() {

    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    @Override
    public String toString() {
        return getAd() + " " + getSoyad() + " / Title = " + getGorevi()
                + " / Department = " + getDepartman();
    }
}

