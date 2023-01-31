package Gun05;

import java.util.Scanner;

public class _09_Ornek8_Tekrar {
    public static void main(String[] args) {
        //Kullanicidan agirligini double, boyunu double olarak aliniz.
        //ve bir satirda boyunu... ve kilonuz... seklinde yazdiriniz
        //vucut kitle indexinide bularak yazdiriniz kg/(boy*boy)

        Scanner oku=new Scanner(System.in);
        System.out.print("AGIRLIK=");
        double kilo= oku.nextDouble();

        System.out.print("BOY=");
        double boy= oku.nextDouble();;


        double endex=kilo/(boy*boy);

        System.out.println("kilonuz = " + kilo+","+"boyunuz="+boy);

        System.out.println("endex = " + endex);
        //Scanner disardan veri okumamizi saglar


    }
}
