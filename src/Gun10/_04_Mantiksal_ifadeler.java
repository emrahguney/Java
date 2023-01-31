package Gun10;

import java.util.Scanner;

public class _04_Mantiksal_ifadeler {
    public static void main(String[] args) {
        //Mantiksal ifadeler
        // && = ve demektir
        // || = veya demektir

        //Girilen sayi pozitif ve tek ise ekrana uygun sayi girildi
        //degilse uygun sayi girilmedi yazdiriniz
        Scanner oku=new Scanner(System.in);
        System.out.print("SAYI GIR=" );
        int sayi= oku.nextInt();

        if (sayi%2==1 && sayi>0)
            System.out.println("UYGUN SAYI GIRILDI" );
        else
            System.out.println("UYGUN SAYI GIRILMEDI" );
    }
}
