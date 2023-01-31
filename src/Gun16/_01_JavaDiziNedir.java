package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        
        int ogrNot; //1 tane not saklar
        
        
        // 50 kisi var
        
        int ogr1Not;
        int ogr2Not;
        int ogr3Not;
        //.........
        //.........
        //.........
        int ogr50Not;
        
        //bana bir tanimlamada BIRDEN FAZLA deger tutabilen bir degiskene ihtiyacim var;

        //COZUM:
        int[] notlar=new int[50];   //50 tane int saklayabilen notlar isimli degisken
        
        notlar[0]=75;
        notlar[1]=88;
        //....
        //....
        notlar[49]=95; //en son eleman toplam eleman sayisi-1 length-1 dir boylede 0-49 indexdir
        //notlar[50]=53; hata verir challenger patlar
        System.out.println("notlar[1] = " + notlar[1]);

        System.out.println("notlar.length = " + notlar.length); // 50 yani toplam eleman sayisini verir.


        //dizi nasil okutulur-> FOR dongusu ile okutulur

        Scanner oku=new Scanner(System.in);
        for(int i=0; i<notlar.length;i++)
            {
                System.out.print("NOT GIR = ");
                notlar[i]= oku.nextInt();       //notlarin degerini girdik//okutma
            }

            for(int i=0;i<notlar.length;i++)
            {
                System.out.println(notlar[i]);      //notlari yazdirdik
            }

        }


    }

