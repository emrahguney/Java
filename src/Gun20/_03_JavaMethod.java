package Gun20;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        //kullanicinin girecegi bir sayiya kadar olan sayilarin carpimini (faktoriyel)
        Scanner oku = new Scanner(System.in);
        System.out.print("SAYI GIR=");
        int sayi = oku.nextInt();

        int carpim = carpimfor(sayi);
        int enb=carpim;
        if (carpim%2==1)
            System.out.println("tek" );
        else System.out.println("cift" );

        System.out.println("carpim = " + carpim);
    }

    public static int carpimfor(int asd) {

        int toplam = 1;
        for (int i = 1; i <= asd; i++) {
            toplam *= i;

        }
        System.out.println(toplam);
         return toplam;

    }

}  /*Scanner scan=new Scanner(System.in);
        System.out.print("enter the number=");
                int number= scan.nextInt();
                multiplication(number);

                }

public static int multiplication(int num){
        int total=1;
        for (int i = 1; i <=num ; i++) {

        total*=i;
        }
        System.out.println("total = " + total);
        if (total%2==1){
        System.out.println("ood number");
        }else System.out.println("even number");

        return total;*/