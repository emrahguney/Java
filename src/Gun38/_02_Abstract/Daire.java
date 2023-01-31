package Gun38._02_Abstract;

public class Daire extends  Sekil{
private double yaricap;


    @Override
    double alan() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    double cevre() {
        return Math.PI*yaricap*2;
    }

    public Daire(double yaricap) {

        this.yaricap = yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

}
