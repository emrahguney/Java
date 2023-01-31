package Gun35._03_Polymorphism;

public class Ogrenci{

    private String ad;
    private String soyad;
    private String gorevi;
    private String subesi;

    public Ogrenci() {

    }

    public Ogrenci(String ad, String soyad, String gorevi, String subesi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
        setSubesi(subesi);
    }

    public Ogrenci(String ad, String soyad, String gorevi) {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

    public String toString() {
        return getAd() + " " + getSoyad() + " / Title = " + getGorevi()
                + " / Class = " + getSubesi();
    }
}
