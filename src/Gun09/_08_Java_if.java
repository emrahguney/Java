package Gun09;

import java.util.Scanner;

public class _08_Java_if {
    public static void main(String[] args) {
        //Kullanicinin 2 kez girecegi sifresinin ayni oldugunu
        //AYNI veya DEGIL seklinde cevaplayiniz

        Scanner oku=new Scanner(System.in);
        System.out.print("SIFRE GIR = " );
        String sifre1= oku.nextLine();
        System.out.print("SIFRE GIR 2 = " );
        String sifre2= oku.nextLine();

        if (sifre1.equals(sifre2))
        {System.out.println(" AYNI" );}
        if(!sifre1.equals(sifre2))
        {System.out.println(" DEGIL");}

        //2.yol
        boolean ayniMi= sifre1.equals(sifre2);
        if(ayniMi==true)
            System.out.println(" AYNI " );
        if(ayniMi==false)
            System.out.println("AYNI DEGIL " );
        //




    }
}
