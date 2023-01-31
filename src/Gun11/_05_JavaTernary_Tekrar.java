package Gun11;

import java.util.Scanner;

public class _05_JavaTernary_Tekrar {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.

        System.out.println("SAYI GIR =" );
        int sayi= oku.nextInt();

        System.out.println(sayi>0 ?"pozitif" :(sayi<0 ?"negatif" :"SIFIR"));

    }
}
