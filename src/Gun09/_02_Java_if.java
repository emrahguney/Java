package Gun09;

import java.util.Scanner;

public class _02_Java_if {
    public static void main(String[] args) {
        //Girilen bir sayinin negatifmi pozitifmi oldugunu yazdiriniz.sifir ise sifir yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi gir = " );
        int sayi= oku.nextInt();

        if (sayi>0)
       System.out.print("sayi pozitif  ");

        if (sayi < 0)
            System.out.print("sayi negatif " );//->//if  degerinin icine birden fazla deger girilecekse { ve } isaretlerini yapmaliyiz

        if (sayi==0)
            System.out.print(" sayi sifir " );



    }
}
