package Gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        //Girilen 15 sayinin toplaminin sonucunu yazdiriniz
        Scanner oku=new Scanner(System.in);

        int toplam=0;

        int sayac=1;
        while (sayac<=15){
            System.out.print(sayac+".sayi gir= " );
            int sayi= oku.nextInt();
             toplam=sayi+toplam;
             sayac++;

        }
        System.out.println("TOPLAM = "+toplam );
    }
}