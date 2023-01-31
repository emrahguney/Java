package Gun03;

public class _05_Ornek1 {
    public static void main(String[] args) {
        //  İki kenarı tanımlı olarak verilen bir
        //  dikdortgenin çevresini ve alanını bulunuz
        //  çarpma :   * kullanılıyor ,   x ise harf olarak kullanılıyor
        //  bir kenarı a ise , diğer kenarı b ise, cevre=a+a+b+b, alan =a*b

        int kisaKenar = 4;
        int uzunKenar = 5;

        int cevre = uzunKenar + uzunKenar + kisaKenar + kisaKenar;
        int alan = uzunKenar * kisaKenar;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);


        int kKenar = 213;
        int uKenar = 674;

        int c = uKenar + uKenar + kKenar + kKenar;
        int a = uKenar * kKenar;

        System.out.println("a = " + a);
        System.out.println("c = " + c);


    }
}
