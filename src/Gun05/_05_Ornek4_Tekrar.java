package Gun05;

import java.util.Scanner;

public class _05_Ornek4_Tekrar {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 2 tam sayinin toplamini ekrana yazdiriniz
        Scanner oku=new Scanner(System.in);


        System.out.print("birinci sayi=");

        int sayi1= oku.nextInt();

        System.out.print("ikinci sayi=");
        int sayi2= oku.nextInt();

        int toplam=sayi1+sayi2;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println("toplam="+toplam );



    }
}
