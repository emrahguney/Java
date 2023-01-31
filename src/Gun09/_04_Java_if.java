package Gun09;

import java.util.Scanner;

public class _04_Java_if {
    public static void main(String[] args) {
        //girilen bir sayinin tekmi ciftmi oldugunu yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi gir= ");
        int sayi=oku.nextInt();

        if (sayi%2==0)
            System.out.println("CIFT");
        if (sayi%2 !=0)
            System.out.println(" TEK" );








    }
}
