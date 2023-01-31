package Gun05;

import java.util.Scanner;

public class _07_Ornek6_Tekrar {
    public static void main(String[] args) {
        //Bir dikdortgenin gerekli kenar uzunluklarini kullanicidan isteyip cevre ve alani bul ve yaz
        //cevre=a+b+a+b   alan=a*b

        Scanner oku=new Scanner(System.in);

        System.out.print(" kisakenar a= " );
        int a= oku.nextInt();
        System.out.print(" uzunkenar b= " );
        int b= oku.nextInt();


        int cevre=a+a+b+b;
        int alan=a*b;



        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

    }
}
