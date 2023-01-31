package Gun05;

import java.util.Scanner;

public class _09_Ornek8 {
    public static void main(String[] args) {
        //Kullanicidan agirligini double, boyunu double olarak aliniz.
        //ve bir satirda boyunu... ve kilonuz... seklinde yazdiriniz
        //vucut kitle indexinide bularak yazdiriniz(kg/boy*boy)
        Scanner oku=new Scanner(System.in);

        System.out.print("Kilonuz=");
        double agirlik=oku.nextDouble();

        System.out.print("Boyunuz=");
        double boy=oku.nextDouble();

        System.out.println("agirlik = " + agirlik);
        System.out.println("Boyunuz="+boy);
        double endeks=agirlik/(boy*boy);

        System.out.println("endeks = " + endeks);

    }
}
