package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        // Math.max yontemi ile girilen 3 sayidan buyuk olani bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("a degeri=");
        int a= oku.nextInt();
        System.out.print("b degeri=");
        int b= oku.nextInt();
        System.out.print("c degeri = " );
        int c= oku.nextInt();


        //1. yontem
        int enbuyuk=Math.max(a,b);
        enbuyuk=Math.max(enbuyuk,c);
        System.out.println("enbuyuk = " + enbuyuk);

        //2.yontem
        int enbuyuk2=Math.max(a,Math.max(b,c));
        System.out.println("enbuyuk2 = " + enbuyuk2);

    }
}
