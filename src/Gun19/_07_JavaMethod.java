package Gun19;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {        //3.

       int tekdir= tekMiCiftMi(55);//sayi=55
        System.out.println("tekdir = " + tekdir);
        tekMiCiftMi(60);



        //Kullanicidan sayi olarak onu tekmi ciftmi yazdiralim
        tekMiCiftMiOku();

    }
    public static int tekMiCiftMi(int sayi){       //1.

        if (sayi%2!=0)
        { System.out.println("tek" );return sayi;}
        else System.out.println("cift" );return sayi;



    }

    public static void tekMiCiftMiOku(){        //2.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz=" );
        int sayi= oku.nextInt();

        tekMiCiftMi(sayi);// okutmak icin ortadaki sinifin adini yazip tekmi ciftmi oldugunu buluruz.
                            // tekrar kod yazmaya gerek yok
    }


}
