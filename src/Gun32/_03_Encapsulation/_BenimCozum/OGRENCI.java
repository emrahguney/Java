package Gun32._03_Encapsulation._BenimCozum;

public class OGRENCI {
   private int ID;
    private String ad;
    private String soyad;
    private int yas;
    static int sayac=1;

    public OGRENCI(String ad, String soyad, int yas) {
       setID(sayac++);
        setAd(ad);
        setSoyad(soyad);
       setYas(yas);
    }

    private void setID(int ID) {this.ID=ID;
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

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "OGRENCI{" +
                "ID=" + ID +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
