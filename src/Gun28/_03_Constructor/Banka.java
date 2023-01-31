package Gun28._03_Constructor;

public class Banka {
    String adi;
    int subesayisi;
    int kurulusyili;


    public Banka(String adi1, int subesayisi1, int kurulusyili1) {
        this.adi = adi1;
        this.subesayisi = subesayisi1;
        this.kurulusyili = kurulusyili1;
    }

    public Banka(String adi2) {
        adi = adi2;
    }

    public Banka(int subesayisi3) {
        this.subesayisi = subesayisi3;
    }

    public Banka() {
    }

    @Override
    public String toString() {

       if (kurulusyili>0){
           return "Banka{" +
                   "adi='" + adi + '\'' +
                   ", subesayisi=" + subesayisi +
                   ", kurulusyili=" + kurulusyili ;}
       else {


        return "Banka{" +
                "adi='" + adi + '\'' +
                ", subesayisi=" + subesayisi +
                ", kurulusyili=tanimsiz}";}



       }

    }

