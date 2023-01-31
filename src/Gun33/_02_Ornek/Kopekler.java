package Gun33._02_Ornek;

public class Kopekler extends Hayvan {

    public Kopekler(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        System.out.println("havladi");
    }

}
