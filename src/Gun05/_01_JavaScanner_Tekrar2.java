package Gun05;


import java.util.Scanner;

public class _01_JavaScanner_Tekrar2 {
    public static void main(String[] args) {
  int sayi=5;

  Scanner okuyucu=new Scanner(System.in);

        System.out.print("sayi giriniz=");

        sayi=okuyucu.nextInt();
        System.out.println("sayi="+sayi);

}
}