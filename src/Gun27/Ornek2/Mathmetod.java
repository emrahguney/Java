package Gun27.Ornek2;

public class Mathmetod {

    public static double maksimum(double sayi1, int sayi2){
        return Math.max(sayi1, sayi2);

    }

    public static double minimum(double sayi1, int sayi2){

        return Math.min(sayi1, sayi2);

    }

    public static double round(double sayi1){

        return Math.round(sayi1);
    }
    public static int getRandom(int max){
        return (int)(Math.random()*max);
    }

    public static double getKareKok(int b){
        return Math.sqrt(b);
    }

    public static double getUsAl(double a, int b){
        return Math.pow(a,b);
    }
}
