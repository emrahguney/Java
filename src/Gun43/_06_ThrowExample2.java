package Gun43;

import java.util.Scanner;

public class _06_ThrowExample2 {
    public static void main(String[] args) {


        Scanner oku = new Scanner(System.in);
        System.out.println("Yeni sifre olusturma");

        System.out.print("Yeni sifreniz=");
        String newPassword = oku.nextLine();

        try {
            if (newPassword.length() < 8) {//bu mesaj ile suni hata olustur
                throw new Exception("Sifre en az 8 karakterden olusmalidir");
                //log tutma
            }

            if (newPassword.length() > 15) {//bu mesaj ile suni hata olustur
                throw new Exception("Sifre en fazla 15 karakterden olusmalidir");
                //log tutma
            }
        }catch (Exception ex)
        {
            //hatalar bir yere toplanip, hepsi icin yapilmasi gereken islemler
            //bir arada burada yapilabilir. mesela log tutma gibi
            System.out.println("Lutfen dikkat!");
            System.out.println(ex.getMessage());
            //log tutma
        }

    }
}
