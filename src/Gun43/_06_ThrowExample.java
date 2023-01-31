package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Yeni sifre olusturma");

        System.out.print("Yeni sifreniz=");
        String newPassword= oku.nextLine();

        if (newPassword.length()<8){
            System.out.println("Lutfen dikkat");
            System.out.println("Sifre en az 8 karakterden olusmalidir");
            //log tutma
        }

        if (newPassword.length()>15){

            System.out.println("Lutfen dikkat!");
            System.out.println("Sifre en fazla 15 karakterden olusmalidir");
            //log tutma
        }
    }
}
