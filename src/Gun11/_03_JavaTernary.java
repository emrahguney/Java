package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("sayi gir=");

        int sayi= oku.nextInt();

        //Ekrana bir string cikardigi icin;
        String sonuc=(sayi%2==0)  ?"cift"    :"tek"  ;  // ?->if    :->else

        System.out.println("sonuc = " + sonuc);//veya
                                                 System.out.println((sayi%2==0)  ?"cift"    :"tek");




    }
}
