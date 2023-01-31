package Gun11;

import java.util.Scanner;

public class _02_IfElse_Tekrar {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        System.out.println("KAC SAAT KALDI=");
        int sure= oku.nextInt();

        if (sure<=3)
            System.out.println("10 TL" );
        else
            if (sure<=5)
                System.out.println(" 15 TL" );
            else
                System.out.println(" 20 TL" );
    }
}
