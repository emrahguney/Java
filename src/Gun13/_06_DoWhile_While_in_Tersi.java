package Gun13;

import java.util.Scanner;

public class _06_DoWhile_While_in_Tersi {
    public static void main(String[] args) {

        //Kullanici 0 degeri girene kadar, girdigi sayilarin toplamini bulunuz
        Scanner oku=new Scanner(System.in);
        int sayi;
        int toplam=0;

        System.out.println("Sayi giriniz= " );  //KULLANICIYA BASLANGICTA BIR SAYI ALDIRMAMIZ LAZIMKI DONGUYE GIREBILSIN. ILK ONCE BIR OKUTCAZ SONRA DONGUYE GIRCEKMI BELLI OLACAK
        sayi= oku.nextInt();                    //SAYININ DEGERI BELLI OLMASI LAZIM DONGUYE GIREBILMESI ICIN
                                                //ILK GIRDIGI SAYI BELLI OLMASI LAZIM


        toplam=toplam+sayi;     //ILK SAYIYIDA ALMASI ICIN BUNUDA YAZIYORUZ

        //PROGRAM ILK ONCE YUKARDAKI "Sayi giriniz" diyor. sifirdan buyukse while dongusune giriyor. ondan sonra hep while dongusundeki "sayi giriniz" e donguye giriyor taki sifir girilene kadar

        while(sayi !=0)     //ILK BASTA BIR SAYI GIRIP KONTROL ETMESI ICIN YUKARIYA SAYIYI TANIMLAMAMIZ LAZIM SAYININ DEGERI BELLI OLMASI LAZIM(BELKIDE SIFIR GIRER DIYE)
        {
            System.out.print("sayi giriniz=");
            sayi= oku.nextInt();

            toplam=toplam+sayi;
        }
        System.out.println("toplam = " + toplam);

    }
}
//2,yol
 /**  System.out.println("sayi = ");
           int sayi= oku.nextInt();
           int toplam=0;
           while( sayi!=0){
           toplam=sayi+toplam;
           System.out.println("sayi = " );
           sayi= oku.nextInt();}
  System.out.println("toplam = " + toplam);
             */
