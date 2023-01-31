package Gun16;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        //50 kisilik bir sinifin notlarini giriniz ve ortalamadan buyuk kac not oldugunu bulunuz ve bunlari yazdiriniz

        Scanner scan =new Scanner(System.in);
        int []sinif=new int[5];
        int toplam=0;

        for (int i = 0; i < sinif.length ; i++) {
            System.out.println("not=");
            sinif[i]= scan.nextInt();
            toplam+=sinif[i];

        }
        System.out.println("toplam not="+toplam);

        int ort=(toplam/ sinif.length);
        System.out.println("ort = " + ort);
        int ortgecen=0;
        int ortkalan=0;
        for (int i = 0; i < sinif.length ; i++) {
            if (sinif[i]>=ort){
                ortgecen++;
                System.out.println("ort gecen="+sinif[i]);
            }
            else if(sinif[i]<ort) {ortkalan++; System.out.println("ortkalan="+sinif[i]);}

        }

        System.out.println("ortgecen sayisi = " + ortgecen);
        System.out.println("ortkalan sayisi= " + ortkalan);
        }





    }

