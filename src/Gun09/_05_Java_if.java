package Gun09;

import java.util.Scanner;

public class _05_Java_if {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 den büyük-eşit
        // ise geçtiniz, küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Not Gir = " );
        int not= oku.nextInt();

        if (not>=50)
            System.out.println(" GECTIN " );
        if (not<50)
            System.out.println("KALDIN");


    }
}
