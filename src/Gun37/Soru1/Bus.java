package Gun37.Soru1;

public class Bus extends Vehicle implements IDiesel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "bir depo ile 1100 km gider";
    }

    @Override
    public String drive() {
        return "en fazla 90km hiz ile gider";
    }

    @Override
    public String toString() {
        return "Bus"+"\n"+changeDiesel()+"/"+drive();
    }

}
