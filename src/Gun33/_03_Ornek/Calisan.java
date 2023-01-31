package Gun33._03_Ornek;

public class Calisan {

    String isim;
    double maas;
    double maasKatSayisi;

    public Calisan(String isim, double maas, double maasKatSayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaasKatSayisi(maasKatSayisi);
    }

    public double MaasHesapla(){

        return maas*maasKatSayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatSayisi=" + maasKatSayisi +
                ", Odenecek Maas=" + MaasHesapla()+
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }



    public double getMaasKatSayisi() {
        return maasKatSayisi;
    }

    public void setMaasKatSayisi(double maasKatSayisi) {
        this.maasKatSayisi = maasKatSayisi;
    }
}
