package Gun05;

import java.util.Scanner;

public class _04_Ornek3 {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırnız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Adiniz=");
        String Ad=oku.nextLine();
        System.out.print("Soyadiniz=");
        String SoyAd=oku.nextLine();

        System.out.println("Ad = " + Ad);
        System.out.println("SoyAd = " + SoyAd);
        System.out.println("Adiniz ve soyadiniz= "+Ad+" "+SoyAd );

    }
}
