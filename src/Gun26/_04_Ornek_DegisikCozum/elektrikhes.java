package Gun26._04_Ornek_DegisikCozum;

public class elektrikhes {

    private int toplamtuketim;
    private double birimFiyat;
    private double fatura;


    public elektrikhes(int toplamtuketim, double birimFiyat) {
       this.toplamtuketim=toplamtuketim;
       setBirimFiyat(birimFiyat);
        setFatura(fatura);
    }

    public int getToplamtuketim(int toplamtuketim) {
        return this.toplamtuketim;
    }

    public void setToplamtuketim(int toplamtuketim) {
        this.toplamtuketim = toplamtuketim;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public double getFatura() {
        return fatura;
    }
    void toplamTuk(int aylik){
        toplamtuketim=toplamtuketim+aylik;

    }
    public void setFatura(double fatura) {
        this.fatura = (toplamtuketim*birimFiyat);
    }

    @Override
    public String toString() {
        return "elektrikhes{" +
                "toplamtuketim=" + toplamtuketim +
                ", birimFiyat=" + birimFiyat +
                ", fatura=" + (fatura=(toplamtuketim*birimFiyat)) +
                '}';
    }


}
