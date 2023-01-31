package Gun38._02_Abstract;

public class Dikdortgen extends Sekil{
private double a;
private double b;


    @Override
    double alan() {
        return a*b;
    }

    @Override
    double cevre() {
        return a+a+b+b;
    }

    public Dikdortgen(double a, double b) {


        setA(a);
        setB(b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
