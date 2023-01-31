package Gun34._01_Ornek;

public class Otobus extends Arac {

    private int yolcuKapasitesi;

    public Otobus(String renk, int motorHacmi, String marka) {
        super(renk, motorHacmi, marka);


    }

    public Otobus(String renk, int motorHacmi, String marka, int yolcuKapasitesi) {
        super(renk, motorHacmi, marka);
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    public String toString() {
        return "Renk="+getRenk()+" "+"Motor Hacmi="+getMotorHacmi()+" "+"Marka="+getMarka()+" "+"Yolcu kapasitesi="+this.yolcuKapasitesi;
    }
}
