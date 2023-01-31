package Gun37.Soru2;

public class Shark implements Sailing,Animal{
    @Override
    public String food() {
        return "Kopek baliklari Baliklari avlar ve yer";
    }

    @Override
    public String sailing() {
        return "Kopek baliklari Genellikle okyanus sularinda yuzer";
    }

    @Override
    public String toString() {
        return food()+"/"+sailing();
    }
}
