package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 den büyük-eşit
        // ise geçtiniz, küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Not Gir = " );
        int not= oku.nextInt();
        //1.Yontem(onceki)
        if (not>=50)
            System.out.println(" GECTIN " );
        if (not<50)
            System.out.println("KALDIN");

        //2.Yontem (olmasi gereken)

        if (not>=50){
            System.out.println(" GECTINIZ" );} //EVET
        else{
            System.out.println("KALDINIZ");}  //HAYIR
    }
}
