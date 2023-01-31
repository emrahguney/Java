package Gun14;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        //kullanicidan 5 sayi isteyiniz. Bu sayilardan 6 ile 10 arasindakiler haric digerlerini toplasin

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        for (int i=0; i<5;i++)
        {
            System.out.print("SAYI GIR = " );
            int sayi= oku.nextInt();

            if (sayi>=6 && sayi<=10)
                continue; //calistigi anda kendinden sonra gelen komutlari pas gecirir

            toplam=toplam+sayi;
            System.out.println("toplam = " + toplam);
        }
    }
}
//break ve continue-> donguleri etkiler if sarti ile calisirlar. Break donguyu kirar. Continue ise sadece o adimi pass gecirir ve dongu devam eder