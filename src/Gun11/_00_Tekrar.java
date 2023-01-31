package Gun11;
import java.util.Scanner;

public class _00_Tekrar {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("sayi gir = " );

        int sinir= oku.nextInt();

        int randomsayi=(int)(Math.random()*sinir);
        System.out.print("tahmin sayin = " );
        int tahmin= oku.nextInt();

        if (randomsayi==tahmin)
            System.out.println("TEBRIKLER" );
        else
            System.out.println("BILEMEDIN");


    }
}