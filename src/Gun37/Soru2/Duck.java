package Gun37.Soru2;

public class Duck implements Sailing,Flying,Animal{
    @Override
    public String food() {
        return "Ordekler bocek ve baliklarla beslenir";
    }

    @Override
    public String flying() {
        return "Ordekler ucabilir";
    }

    @Override
    public String sailing() {
        return "Ordekler yuzebilir";
    }

    @Override
    public String toString() {
        return food()+"/"+flying()+"/"+sailing();
    }
}
