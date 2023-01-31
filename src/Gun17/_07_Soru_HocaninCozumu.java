package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru_HocaninCozumu {
    public static void main(String[] args) {
        //10 elemanli bir diziyi random olarak doldurtuktan sonra, kullanicinin girecegi bir rakami arattiriniz bu rakam var ise indexini yazdiriniz
        int[] dizi=new int[10];



        for (int i = 0; i <dizi.length ; i++) {//10 elemanli bir diziyi random olarak doldurtuktan sonra

            dizi[i]=(int)(Math.random()*11);
        }
        System.out.println(Arrays.toString(dizi));

        Scanner oku=new Scanner(System.in);
        System.out.print("Aranacak sayi(0-10)=" );
        int arananRakam= oku.nextInt();//kullanicinin girecegi bir rakami

        for (int i = 0; i <dizi.length ; i++) {//bir rakami arattiriniz

            if(dizi[i]==arananRakam)
                System.out.println("var oda numarasi"+i+". indexde");

        }

    }
}
