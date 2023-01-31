package Gun03;

public class _06_Ornek2 {
    public static void main(String[] args) {

        //Ornek Soru: yaricapi(r) verilen bir dairenin cevresini ve alanini bulunuz
        //alan=pi*r*r   cevre=2*pi*r        pi=3.14

        int yaricap = 4;
        double pi= 3.14;
        double alan = pi * yaricap*yaricap;
        double cevre =  2 * pi *yaricap;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }
}
