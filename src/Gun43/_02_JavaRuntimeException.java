package Gun43;

import sun.font.FontRunIterator;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {

      try{  //hata bolgesini try{} ine aldik
          Scanner oku=new Scanner(System.in);
        System.out.print("Sayi 1=");
        int sayi1= oku.nextInt();
        System.out.print("Sayi 2=");
        int sayi2= oku.nextInt();



        int bolum=(sayi1/sayi2);//sayi2=0 girince hata verir

        System.out.println("bolum = " + bolum);}catch (Exception hata)
        //hata mesajlarini hata isimli Exception cinsinden degiskene attik
      {
          System.out.println("hata="+hata.getMessage());
          System.out.println("hata+ = " + hata);

          System.out.println("Lutfen tekrar deneyiniz");
      }

        System.out.println("program bitti");
        //DONGUYEDE SOKABILIRIZ(DO WHILE , FOR DONGULERINE)

   /*     for (int i = 0; i < 3; i++) {


            try {  //hata bolgesini try{} ine aldik
                Scanner oku = new Scanner(System.in);
                System.out.print("Sayi 1=");
                int sayi1 = oku.nextInt();
                System.out.print("Sayi 2=");
                int sayi2 = oku.nextInt();


                int bolum = (sayi1 / sayi2);//sayi2=0 girince hata verir

                System.out.println("bolum = " + bolum);
            } catch (Exception hata)
            //hata mesajlarini hata isimli Exception cinsinden degiskene attik
            {
                System.out.println("hata=" + hata.getMessage());
                System.out.println("hata+ = " + hata);

                System.out.println("Lutfen tekrar deneyiniz");
                i--;
            }
        }
        System.out.println("program bitti");
*/
    }



}
