package Gun14;

import java.util.Scanner;

public class _06_forLoop {
    public static void main(String[] args) {
        //Girilen bir sayiya(dahil) kadar olan sayilarin carpimini bulunuz
        //2.bolum:carpimin degeri 1000 i gectiginde islem sonlansin

        Scanner oku=new Scanner(System.in);

        System.out.print("SAYI GIR = " );
        int sinir= oku.nextInt();

        int carpim=1;

        for(int i=1;i<=sinir;i++) {
            carpim = i * carpim;
            if (carpim >= 10000) {
                System.out.println("10 bini gecti ");
                break;
            }
        }
        System.out.println("toplam = " + carpim);


        /* 2.cozum
         Scanner oku=new Scanner(System.in);
        System.out.print(" sayi gir= " );
        int sayi= oku.nextInt();
        int toplam=1;

        for (int i = 1; i <=sayi ; i++) {
            toplam=(toplam*i);
            System.out.println("i = " + i);
            if (toplam>1000)break;

        }
        System.out.println("toplam = " + toplam);
         */
    }
}
