package Gun05;

import java.util.Scanner;

public class _00_TEKRAR {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("AGIRLIK = " );
        double agirlik= oku.nextDouble();
        System.out.print("BOY = ");
        double boy= oku.nextDouble();

        double index=agirlik/(boy*boy);
        System.out.println("BOY = "+boy+" "+"KILO="+agirlik);
        System.out.println("index = " + index);



    }
}
