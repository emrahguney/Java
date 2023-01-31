package Gun06;

import java.util.Scanner;

public class _00_Tekrar {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("AD VE SOYAD = ");
        String adSoyad= oku.nextLine();
        int bosluk=adSoyad.indexOf(" ");

        char ad=adSoyad.charAt(0);
        char soyad=adSoyad.charAt(bosluk+1);

        System.out.println("Ad ve Soyad = " +ad+"."+ soyad+".");

    }
}
