package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("CUMLE GIR " );
        String cumle= oku.nextLine().toLowerCase();

        if (cumle.length()>=10 && cumle.contains("study"))
        System.out.println("EVET " );
        else
            System.out.println("hayir" );

        //HOCANIN YAPTIGI 2.COZUM

        //boolean varmi=cumle.contains("study");
        if (cumle.length()>=10 && cumle.toLowerCase().contains("study"))
            System.out.println("EVET " );
        else
            System.out.println("hayir" );

    }
}
