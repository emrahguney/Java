package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //10 elemanli bir diziyi random olarak doldurtuktan sonra, kullanicinin girecegi bir rakami arattiriniz bu rakam var ise indexini yazdiriniz
        Scanner oku = new Scanner(System.in);

        int[] sayi = new int[10];

        for (int i = 0; i < sayi.length; i++) {

            sayi[i] = (int) (Math.random() * 10);
        }
        System.out.print("SAYI GIR = ");
        int kullanici = oku.nextInt();

        for (int i = 0; i < sayi.length; i++) {

            if (sayi[i] == kullanici)
                System.out.println(i + ". indexde ");

        }
        System.out.println(Arrays.toString(sayi));

    }}

/* Scanner scan=new Scanner(System.in);
        int dizi[]=new int[10];

        boolean var=false;
        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]=(int)(Math.random()*10);
            System.out.println(i+". index "+dizi[i]);
        }

        System.out.print("sayi gir=");
        int sayi= scan.nextInt();

        for (int i = 0; i < dizi.length ; i++) {
            if (sayi==dizi[i]){
                var=true;
                System.out.println(i+". index sayisi ile aynidir");
            }
        }if(var==false){
            System.out.println("bulunamadi");}*/
/**2.YOL

 Scanner oku=new Scanner(System.in);

 int sayi[]=new int[10];

 for (int i = 0; i < sayi.length ; i++) {
 sayi[i]=(int)(Math.random()*11);
 }
 System.out.print("SAYI GIR = " );
 int kullanici= oku.nextInt();
 Arrays.sort(sayi);
 for (int i = 0; i < sayi.length ; i++) {
 if (kullanici==sayi[i])
 System.out.println("sayi "+i+". index ile ayni sayiyi tasiyor");
 }
 // Arrays.sort(sayi);
 System.out.println(Arrays.toString(sayi));
 }
 }


 */