package Gun11;

import java.util.Scanner;

public class _04_JavaTernary_Tekrar {
    public static void main(String[] args) {
        //?=if :=else
        //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini ekrana yazdırınız.
        // Ternary operatör ile yapınız.


        //2.cozum
        Scanner oku=new Scanner(System.in);

        System.out.print(" SAYI GIR=" );
        int sayi= oku.nextInt();

        System.out.println(sayi>50 ?"1" :"0" );
    }
}
