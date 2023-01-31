package Gun36.Interface6;

public class Dikdortgen implements IAlan{


    @Override
    public double alan(double a, double b) {
        return (a*b);
    }

    @Override
    public double cevre(double a, double b) {
        return (2*(a+b));
    }
}
