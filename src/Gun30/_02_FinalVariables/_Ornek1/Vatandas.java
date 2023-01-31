package Gun30._02_FinalVariables._Ornek1;

public class Vatandas {
     final   String isim;
    final int tcNo;
    static int tcNoSayac=1;

    public Vatandas(String isim){
        this.isim=isim;
        this.tcNo=tcNoSayac++;

    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
