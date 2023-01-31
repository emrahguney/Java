package Gun07;

import java.util.Scanner;

public class _00_TEKRAR {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("AD VE SOYAD = ");
        String adSoyad= oku.nextLine();
        int bosluk= adSoyad.indexOf(" ");
        System.out.println("AD = "+adSoyad.substring(0,bosluk) );
        System.out.println("SOYAD = " + adSoyad.substring(bosluk+1));
    }
}
