package Gun33._03_Ornek;

public class GenelMudur extends Calisan{
    private  int Tazminat=10000;
    public GenelMudur(String isim, double maas, double maasKatSayisi,int Tazminat) {

        super(isim, maas, maasKatSayisi);
        setTazminat(Tazminat);
    }

    public int getTazminat() {
        return Tazminat;
    }

    public void setTazminat(int tazminat) {
        this.Tazminat = tazminat;
    }

    public double MaasHesapla(){

        return super.MaasHesapla()+getTazminat();
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "Tazminat=" + Tazminat +
                ", isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatSayisi=" + maasKatSayisi +
                ", Odenecek Maas=" + MaasHesapla()+
                '}';
    }
}
