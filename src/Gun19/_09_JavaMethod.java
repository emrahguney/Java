package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız


            Scanner oku=new Scanner(System.in);
            int dizi[]=new int[5];
            for (int i = 0; i < dizi.length ; i++) {
                System.out.print("SAYI GIR=");
                dizi[i]= oku.nextInt();

            }
             System.out.println(Arrays.toString(dizi));
            Arrays.sort(dizi);
            System.out.println(Arrays.toString(dizi));
            kucuksayi(dizi);
            buyuksayi(dizi);
            ortalama(dizi);
            enb(dizi);//en buyuk bulma 2. yolu
            enk(dizi);//en kucuk bulma 2.yolu


        }public static void kucuksayi(int[] kucuksayi){

           // Arrays.sort(kucuksayi);
            System.out.println("kucuk = " + kucuksayi[0]);



        }
        public static void buyuksayi(int[] buyuksayi){

           // Arrays.sort(buyuksayi);
            System.out.println("buyuk sayi = " + buyuksayi[buyuksayi.length-1]);
        }

        public static void ortalama(int[] ort){
            int toplam=0;
            for (int i = 0; i < ort.length ; i++) {
                toplam=toplam+ort[i];
            }
            System.out.println("toplam = " + toplam);
            int ortalama=toplam/ ort.length;
            System.out.println("ortalama = " + ortalama);
    }


    public static void enb(int[] sayi){
        int enb=sayi[0];
        for (int i = 0; i < sayi.length ; i++) {

            if (sayi[i]>enb){
                enb=sayi[i];
            }
        }
        System.out.println("enb = " + enb);


    }

    public static void enk(int[] sayi){
        int enk=sayi[0];
        for (int i = 0; i < sayi.length ; i++) {

            if (sayi[i]<enk){
                enk=sayi[i];
            }
        }
        System.out.println("enk = " + enk);


    }
    }

