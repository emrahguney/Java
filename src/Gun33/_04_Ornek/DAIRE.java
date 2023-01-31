package Gun33._04_Ornek;

public class DAIRE extends SEKIL{
private int yaricap;

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }

    public DAIRE(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alan() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    public double cevre() {
        return 2*Math.PI*yaricap*yaricap;
    }
}
