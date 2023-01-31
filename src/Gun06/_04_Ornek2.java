package Gun06;

import java.util.Scanner;

public class _04_Ornek2 {
    public static void main(String[] args) {
        //Girilen bir stringin sadece son harfini yazdiriniz ve kac kelimelidir

        Scanner oku=new Scanner(System.in);
        System.out.print("Cumle = ");

        String cumle= oku.nextLine();

        int uzunluk=cumle.length();
        char sonHarf=cumle.charAt(uzunluk-1);
        System.out.println("sonHarf = " + sonHarf);
        System.out.println("uzunluk = " + uzunluk);

        //2.Yontem
        System.out.println("SONHarf = " + cumle.charAt(uzunluk-1));
        System.out.println("uzunluk = " + uzunluk);
    }
}
