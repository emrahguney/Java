package Gun06;

import java.util.Scanner;

public class _04_Ornek2_Tekrar {
    public static void main(String[] args) {

        //Soruda girilen diye baslarsa scanner ile coz
        // Girilen bir stringin sadece son harfini yazdiriniz ve kac kelimelidir

      Scanner oku=new Scanner(System.in);
        System.out.print("YAZ= " );

        String cumle= oku.nextLine();
        int uzunluk=cumle.length();
        //cumlenin sonunu yazdirmak icin uzunlugun bir eksisini aliriz
        char SonHarf=cumle.charAt(uzunluk-1);

        System.out.println("SonHarf = " + SonHarf);
        System.out.println("uzunluk = " + uzunluk);

}
}