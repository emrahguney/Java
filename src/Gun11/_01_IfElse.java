package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //Girilen bir sayiyi pozitif,negatif veya sifir oldugunu yazdiriniz
        //Girilen bir sayi dedigi icin direk int olarak okutabiliriz sadece bir tane oldugu icin.
        // yan yana birden fazla sayi olmadigi icin string okutma mecburiyetimiz yok direk int okut
        //elsenin icine tekrar if else koyabilirsin yine bunun icindeki elsede if else koyabilirsin sonsuza kadar gidebilir.
        Scanner oku=new Scanner(System.in);
        System.out.print("SAYI GIR=" );
        int sayi= oku.nextInt();

        if (sayi>0)
        {   System.out.println("SAYI POZITIF" );

        }


        else //YA SIFIRDIR YADA NEGATIFDIR
        {
            if (sayi==0)
                System.out.println("SIFIR" );
            else
                System.out.println("SAYI NEGATIF" );

        }

    }
}
