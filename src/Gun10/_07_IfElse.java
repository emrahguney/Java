package Gun10;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67
        Scanner oku=new Scanner(System.in);
        System.out.println("sayi1 gir ve sayi2 gir=" );
        String sayilar=oku.nextLine();
        int bosluk=sayilar.indexOf(" ");
        String sayi1=sayilar.substring(0,bosluk);
        String sayi2=sayilar.substring(bosluk+1);

        int ilksayi=Integer.parseInt(sayi1);
        int ikincisayi=Integer.parseInt(sayi2);

        if (ilksayi==ikincisayi)
            System.out.println("ESITTIR " );
        else
            System.out.println("ESIT DEGILDIR" );



    }
}
