package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // Bu gun hava cok guzel -> 5

        Scanner oku=new Scanner(System.in);
        System.out.println("Cumle gir = " );
        String cumle= oku.nextLine();
        int kelime=1;
        for (int i = 1; i <cumle.length() ; i++) {

            if (cumle.charAt(i)==' ')

                kelime=kelime+1;

        }
        System.out.println(" cumlede "+kelime+" kelime var" );





    }
}
