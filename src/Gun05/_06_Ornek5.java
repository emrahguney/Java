package Gun05;

import java.util.Scanner;

public class _06_Ornek5 {
    public static void main(String[] args) {
        //Bir karenin kenarini kullanicidan isteyip cevresini ve alanini bulunuz ve yazdiriniz

        Scanner oku=new Scanner(System.in);

        System.out.print("a=");
        int a=oku.nextInt();
        System.out.println("a = " + a);
        int cevre=a+a+a+a;
        System.out.println("cevre = " + cevre);
        int alan=a*a;
        System.out.println("alan = " + alan);

    }
}
