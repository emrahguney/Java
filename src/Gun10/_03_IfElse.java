package Gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        //Girilen bir sayinin tekmi ciftmi oldugunu yazdiriniz
        System.out.print("SAYI GIR= ");
        int sayi = oku.nextInt();

        if (sayi % 2 == 0)
            System.out.println("SAYI CIFT ");
        else
            System.out.println("SAYI TEK");


    }
}
