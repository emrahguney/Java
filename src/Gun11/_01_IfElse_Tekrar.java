package Gun11;

import java.util.Scanner;

public class _01_IfElse_Tekrar {
    public static void main(String[] args) {
        //Girilen bir sayiyi pozitif,negatif veya sifir oldugunu yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.println("sayi gir=" );
        int sayi= oku.nextInt();

        if (sayi>0)
            System.out.println("POZITIF " );
        else
            if (sayi<0)
                System.out.println("NEGATIF" );
            else System.out.println("SIFIR");

    }
}
