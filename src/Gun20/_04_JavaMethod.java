package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        //Kullanicinin girecegi 2 sayinin toplamini bir fonksiyonda buldurup bunun sonucunu mainde yazdir

        Scanner oku=new Scanner(System.in);
        System.out.print("SAYI GIR=" );
       int a= oku.nextInt();
        System.out.print("SAYI GIR=" );
      int b= oku.nextInt();

      int toplam=toplama(a,b);
        System.out.println("toplam = " + toplam);

    }

    public static int toplama(int x,int y){

        return (x+y);
    }
}
