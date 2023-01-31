package Gun39.Soru5;

public class Borsh implements Food{
    @Override
    public void taste() {
        System.out.println("Sicak sebze corbasi");
    }

    @Override
    public double ucret() {
        return 40;
    }

    void boil(){
        System.out.println("Kisik ateste pisirilmesi lazim");
    }
    void eatTomorrow(){

        System.out.println("Bir gun sonra servis edilir");
    }


}
