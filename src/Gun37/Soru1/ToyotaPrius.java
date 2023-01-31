package Gun37.Soru1;

public class ToyotaPrius extends Vehicle implements IElectric,IGas {


    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Omur boyu kullan";
    }

    @Override
    public String changeOil() {
        return "1 depo ile 250km gider";
    }

    @Override
    public String drive() {
        return "ilk 3 km elektrik gider";
    }

    @Override
    public String toString() {
        return  drive()+changeOil()+changeBattery();
    }
}
