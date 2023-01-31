package Gun33._02_Ornek;

public class Yilan extends Hayvan{
   private int uzunluk;
    public Yilan(String renk, int kilo, String cinsi,int uzunluk) {
        super(renk, kilo, cinsi);
        setUzunluk(uzunluk);
    }

    public void konustu() {
        System.out.println("tisladi");
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }
}
