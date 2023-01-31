package Gun32._03_Encapsulation._BenimCozum;

import java.util.ArrayList;

public class OKUL {
    private String okulAd;
    private int kontenjan;
    private ArrayList<OGRENCI> ogrenciler=new ArrayList<>();

    public OKUL(String okulAd, int kontenjan) {
       setOkulAd(okulAd);
        setKontenjan(kontenjan);

    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    public ArrayList<OGRENCI> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<OGRENCI> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    @Override
    public String toString() {
        return "OKUL{" +
                "okulAd='" + okulAd + '\'' +
                ", kontenjan=" + kontenjan +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}
