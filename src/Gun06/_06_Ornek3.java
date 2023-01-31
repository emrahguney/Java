package Gun06;


import java.util.Scanner;

public class _06_Ornek3 {
    public static void main(String[] args) {
        //Girilen bir ad soyadi"Ismet Temur" I.T seklinde yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.print("isim soyisim = " );

        String adSoyad=oku.nextLine();

        //Ismet Temur-> I.T ->I ->charAt(0) I.
        //indexOf(" ")-> boslugun indexini veriyor, bunun 1 fazlasi charAt() ->T yi verir

        char ilkHarf=adSoyad.charAt(0);
        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkHarf=adSoyad.charAt(boslukIndex+1);
        System.out.println(ilkHarf+"."+soyadIlkHarf+".");
        //char soyadIlkHarf=adSoyad.charAt(adSoyad.indexOf(" ")+1) buda olabilir



    }
}
