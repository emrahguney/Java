package Gun08;

import java.util.Scanner;

public class _08_Soru3_Tekrar {
    public static void main(String[] args) {
        //Girilen bir sayinin tek sayi olup olmadigini yazdiriniz
        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi gir= " );

        int sayi= oku.nextInt();
        int kalan= sayi%2;

        System.out.println("tekmi = " + (kalan==1));
    }
}
