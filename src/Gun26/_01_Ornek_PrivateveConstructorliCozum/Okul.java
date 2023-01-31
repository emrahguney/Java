package Gun26._01_Ornek_PrivateveConstructorliCozum;

public class Okul {
    private String adi;
    private String mudurAdi;
    private double ucreti;

    public Okul(String adi, String mudurAdi, double ucreti) {
        this.adi = adi;
        this.mudurAdi = mudurAdi;
        this.ucreti = ucreti;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getMudurAdi() {
        return mudurAdi;
    }

    public void setMudurAdi(String mudurAdi) {
        this.mudurAdi = mudurAdi;
    }

    public double getUcreti() {
        return ucreti;
    }

    public void setUcreti(double ucreti) {
        this.ucreti = ucreti;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "adi='" + adi + '\'' +
                ", mudurAdi='" + mudurAdi + '\'' +
                ", ucreti=" + ucreti +
                '}';
    }
}
