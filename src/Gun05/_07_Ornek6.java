package Gun05;

import java.util.Scanner;

public class _07_Ornek6 {
    public static void main(String[] args) {
        //Bir dikdortgenin gerekli kenar uzunluklarini kullanicidan isteyip cevre ve alani bul ve yaz

        Scanner oku=new Scanner(System.in);

        System.out.print("uzunkenar=");
        int uzunkenar=oku.nextInt();


        System.out.print("kisakenar=");
        int kisakenar=oku.nextInt();


        int cevre=kisakenar+kisakenar+uzunkenar+uzunkenar;
        System.out.println("cevre = " + cevre);
        int alan=kisakenar*uzunkenar;
        System.out.println("alan = " + alan);

    }
}
