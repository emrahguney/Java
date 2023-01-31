package Gun33._04_Ornek;

public class MAIN {
    public static void main(String[] args) {

        DAIRE daire=new DAIRE(4);
        System.out.println( daire);

        DIKDORTGEN dikdortgen=new DIKDORTGEN(5,7);
        System.out.println(dikdortgen);
        System.out.println(dikdortgen.alan());

        KARE kare=new KARE(5);
        System.out.println(kare);
        System.out.println(kare.alan());

    }
}
