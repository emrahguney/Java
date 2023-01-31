package Gun33._04_Ornek;

public class DIKDORTGEN extends SEKIL{
   private int a;
   private int b;
    @Override
    public double alan() {
        return (a*b);
    }

    @Override
    public double cevre() {
        return (a+a+b+b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public DIKDORTGEN(int a, int b) {
        setA(a);
        setB(b);
    }
}
