package Gun09;


import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class _00_Calisma {
         public static void main(String[] args) {

             //Girilen bir sayiya(dahil) kadar olan sayilarin carpimini bulunuz
             //2.bolum:carpimin degeri 1000 i gectiginde islem sonlansin

             Scanner oku=new Scanner(System.in);


             for (int i = 1; i <=5 ; i++) {
                 for (int j = 1; j <11 ; j++) {
                     System.out.println(i+"*"+j+"="+(i*j));
                 }
                 System.out.println();
             }
    }
}

//sayilari girip arrayliste atip hangisi ondan buyuk oldugunu yazdir,foreach dongusu kullan