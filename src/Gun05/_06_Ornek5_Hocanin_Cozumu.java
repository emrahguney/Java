package Gun05;

import java.util.Scanner;

public class _06_Ornek5_Hocanin_Cozumu {
    public static void main(String[] args) {
        //Bir karenin kenarini kullanicidan isteyip cevresini ve alanini bulunuz ve yazdiriniz
        //cevre=a+a+a+a    alan=a*a

        Scanner kenar=new Scanner(System.in);
        System.out.print("kenar = ");

        int a=kenar.nextInt();
        int cevre=a+a+a+a;
        int alan=a*a;

        System.out.println("a = " + a);
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
