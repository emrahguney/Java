package Gun37.Soru2;

public class Swallow implements Flying, Animal {
    @Override
    public String food() {
        return "Kirlangiclar balikla beslenir";
    }

    @Override
    public String flying() {
        return "Kirlangiclar ucar";
    }

    @Override
    public String toString() {
        return flying()+"/"+food();
    }

    public Swallow() {
    }
}
