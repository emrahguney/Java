package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {

        int sayi=5; //tek bir rakam tutabilen bir degisken
        int[] dizi=new int[22]; //22 adet sayi saklayabilen bir degisken, uzunlugu sabit
        int[][] tablo=new int[21][2];    //21x2 lik sayi saklayabilen degisken,sabit uzunluklu

        ArrayList<Integer> liste=new ArrayList<>();     //istenildigi kadar sayi eklenebilen, uzunlugu degisken
/** ************************************************************************************************************ **/

//bir sinif bu sinifda 20 kisi var ve bunlarin 3 dersi olsun.Ogrencilerin bu 3 derse ait notlarini nasil bir degiskende saklayabilirim
ArrayList<Integer> matNotlari=new ArrayList<>();
 ArrayList<Integer> fizikNotlari=new ArrayList<>();
 ArrayList<Integer> kimyaNotlari=new ArrayList<>();


        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizikNotlari.add(30);
        fizikNotlari.add(40);

        kimyaNotlari.add(60);
        kimyaNotlari.add(70);
        kimyaNotlari.add(80);
        kimyaNotlari.add(90);


        //ArrayList in ArrayList i ni nasil yaparim
        ArrayList<ArrayList<Integer>> notlarListesi=new ArrayList<>();      //ayni int[][] gibi//Listlerin listesi
        notlarListesi.add(matNotlari);
        notlarListesi.add(kimyaNotlari);
        notlarListesi.add(fizikNotlari);


        notlarListesi.get(0);   //-> matNotlari ni verir
        int matBirNot=notlarListesi.get(0).get(0);   //mat notlarinin ilkini aldim

        System.out.println("matBirNot = " + matBirNot);

        System.out.println("mat not = " + notlarListesi.get(0));      //mat notlari
        System.out.println("kimya not= " + notlarListesi.get(1));       //kimya notlari
        System.out.println("notlarListesi.get(2) = " + notlarListesi.get(2));       //fizik notlari

        for (int i = 0; i <notlarListesi.size() ; i++) {    //mat kimya ve fizik notlarinin dongusu
            System.out.println("dongu.get(i) = " + notlarListesi.get(i));

        }
        /* ******************************* SATIR SUTUN YAZDIRMA ******************************* */

        for (int i = 0; i <notlarListesi.size() ; i++) {//i=SATIRLARI , j=SUTUNLARI
            for (int j = 0; j <notlarListesi.get(i).size() ; j++) {//notlar[i].length
                System.out.print(notlarListesi.get(i).get(j)+" ");//notlar.[i][j]

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("FOREACH ILE YAPILIS");
        System.out.println("-------------------------------------");
        for (ArrayList<Integer> qwer:notlarListesi){

            if(qwer == matNotlari){
            System.out.println("mat notlari="+qwer);}
            else if (qwer == kimyaNotlari){
                System.out.println("kimya notlari="+qwer);}
           else if (qwer == fizikNotlari){
                System.out.println("fizik notlari="+qwer);}
        }
        System.out.println("-------------------------------------");
        for (ArrayList<Integer>qwe:notlarListesi){
            System.out.println("notlar="+qwe);
        }










    }
}
