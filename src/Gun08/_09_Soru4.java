package Gun08;

import java.util.Scanner;

public class _09_Soru4 {
    public static void main(String[] args) {
        //girilen bir cumledeki ilk kelimeyi yazdiriniz

        Scanner yeni=new Scanner(System.in);
        System.out.print("cumle gir = " );
        String cumle=yeni.nextLine();

        int boslukIndex=cumle.indexOf(" ");

        String kelime=cumle.substring(0,boslukIndex);
        System.out.println("ilkkelime = " + kelime);


    }
}
