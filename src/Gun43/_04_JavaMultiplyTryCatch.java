package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaMultiplyTryCatch {
    public static void main(String[] args) {

      try{  Scanner oku=new Scanner(System.in);
        System.out.print("Sayi 1=");
        int sayi1= oku.nextInt();
        System.out.print("Sayi 2=");
        int sayi2= oku.nextInt();



        int bolum=(sayi1/sayi2);//sayi2=0 girince hata verir

        System.out.println("bolum = " + bolum);

             // String kelime="";
               //  kelime.charAt(3);
      }


      catch (InputMismatchException ex)//belirli bir hata
      {
          System.out.println("Lutfen sayi giriniz");
      }

      catch (ArithmeticException ex)//belirli bir hata
      {
          System.out.println("Sifira bolme hatasi");
      }

      catch (Exception ex)//yukaridakilerin disinda bir hata buldugunda
      {
          System.out.println("Hata olustu"+ex.getMessage());
      }
    }
}
