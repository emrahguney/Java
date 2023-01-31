package Gun11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("SAYI GIR =");
        int sayi= oku.nextInt();
        double randSayi=Math.random();
        System.out.println("randSayi = " + randSayi);
        int random=(int)(Math.random()*6);
        System.out.println("random = " + random);
        if (sayi==random)
            System.out.println("TEBRIKLER");
        else
            System.out.println("BILEMEDIN" );
    }
}
