package Gun26._01_Ornek_PrivateveConstructorliCozum;

public class Ogrenci {


    private int okulNo;
    private String tamAd;
    private Okul okulu;

    public Ogrenci(int okulNo, String tamAd, Okul okulu) {
        setOkulNo(okulNo);
       setTamAd(tamAd);
        setOkulu(okulu);
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getTamAd() {
        return tamAd;
    }

    public void setTamAd(String tamAd) {
        this.tamAd = tamAd;
    }

    public Okul getOkulu() {
        return okulu;
    }

    public void setOkulu(Okul okulu) {
        this.okulu = okulu;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "okulNo=" + okulNo +
                ", tamAd='" + tamAd + '\'' +
                ", okulu=" + okulu +
                '}';
    }

     void oku(){
        System.out.println("oku bakim");
    }
}
