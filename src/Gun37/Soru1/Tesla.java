package Gun37.Soru1;

public class Tesla extends Vehicle implements IElectric{


    public Tesla(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Batarya 9 yil omru var";
    }

    @Override
    public String drive() {
        return "Auto pilot ozelligi var";
    }

    @Override
    public String toString() {
        return drive()+"/"+changeBattery()+"/";
    }
}
