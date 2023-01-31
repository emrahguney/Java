package Gun13;

import java.util.Scanner;

public class _07_Do_While {
    public static void main(String[] args) {
// Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
        Scanner oku = new Scanner(System.in);
        String okunan;

        do {
            System.out.print("HARF gir = ");
            okunan = oku.next();

            if (!okunan.equalsIgnoreCase("x"))

            System.out.println("PROGRAM CALISIYOR");

        } while (!okunan.equalsIgnoreCase("x"));    //OKUNAN x den farkli ise devam et

        System.out.println("PROGRAM BITTI ");


    }

}

