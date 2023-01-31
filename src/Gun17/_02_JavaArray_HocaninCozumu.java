package Gun17;

import java.util.Scanner;

public class _02_JavaArray_HocaninCozumu {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("cumle = " );
        String cumle= oku.nextLine();

        int bosluksayisi=0;
        for (int i = 0; i <cumle.length() ; i++) {

            if (cumle.charAt(i)==' ')
                bosluksayisi++;
        }
        System.out.println("bosluksayisi = " +(bosluksayisi+1));
    }
}
