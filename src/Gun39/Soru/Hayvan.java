package Gun39.Soru;

public abstract class Hayvan {
    public Hayvan( String isim, boolean vahsi, String dogumtarihi) {
        this.id=sayac++; //final yaptigimiz icin seti de silmemiz gerekiyordu baska birisi deger atamamai icin
        setIsim(isim);
        setVahsi(vahsi);
        setDogumtarihi(dogumtarihi);
    }

    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumtarihi;



    abstract  void yiyecegi();
    abstract  void yemekMiktari();
    abstract  void gunlukUykuSuresi();
    abstract  void sesi();
   private static int sayac=1;



    public int getId() {
        return id;
    }

/**  SETID YI SILMEMIZ LAZIM FINAL OLDUGU ICIN ATAMAYA GEREK YOK YAZARSAN HATA VERIR              */

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumtarihi='" + dogumtarihi + '\'' +

                '}';
    }
}
