package Gun29.Soru.DigerCozum;

public class musteri {

private int hesapID;
private String ad;
private String soyad;
private hesap musHesap;

    public musteri(int hesapID, String ad, String soyad, hesap musHesap) {
        this.hesapID = hesapID;
        this.ad = ad;
        this.soyad = soyad;
        this.musHesap = musHesap;
    }

    public int getHesapID() {
        return hesapID;
    }

    public void setHesapID(int hesapID) {
        this.hesapID = hesapID;
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

    public hesap getMusHesap() {
        return musHesap;
    }

    public void setMusHesap(hesap musHesap) {
        this.musHesap = musHesap;
    }
}

