package Gun11;

import java.util.Scanner;

public class Mentoring {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("SAYI GIR=");
        int sayi= oku.nextInt();

        System.out.println(sayi<0 ? "negatif" :(sayi%2==0 ? "pozitif cift sayi" :"pozitif"));
        }
    }

