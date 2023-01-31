package Gun39.Soru5;

public class Palov implements Food{
    @Override
    public void taste() {
        System.out.println("fena degil");
    }

    @Override
    public double ucret() {
        return 20;
    }

    void fry(){
        System.out.println("pirinc ve sehriye kavruldu");
    }

    void boil(){
        System.out.println("Kisik ateste pisirildi");
    }

}
