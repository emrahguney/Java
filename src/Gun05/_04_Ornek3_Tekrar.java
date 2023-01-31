package Gun05;


import java.util.Scanner;

public class _04_Ornek3_Tekrar {
    public static void main(String[] args) {
        //Kullanicidan adini ve soyadini ayri ayri okutarak alip birlikte ekrana yazdiriniz

      Scanner oku=new Scanner(System.in);

        System.out.print("ADINIZ = " );

        String ad=oku.nextLine();

        System.out.print("SOYADINIZ = " );
        String soyad=oku.nextLine();

        System.out.println("AD = "+ad);
        System.out.println("SOYAD = " + soyad);


    }
}
