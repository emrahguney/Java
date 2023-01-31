package Gun22;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        //ArrayList Collection grubunun bir elemani
        //Array i siralarken Array.sort u kullandigimiz gibi,
        //ArrayList i Collection metodlarini kullanacagiz.
int sayi=10;
        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(3);


   /*     ArrayList<Integer> sayilar2=new ArrayList<>();
        sayilar2.add(3);
        sayilar2.add(3);
        sayilar2.add(3);
        sayilar2.add(3);
        sayilar2.add(3);
        sayilar2.add(456);*/

        System.out.println("sayilar = " + sayilar);
       // sayilar2.removeAll(sayilar);
      //  System.out.println("sayilar22 = " + sayilar2);
        System.out.println("sayilar333 = " + sayilar);

        //Siralama islemi
        Collections.sort(sayilar);
        System.out.println("sayilar.sort = " + sayilar);

        //Tersine cevir
        Collections.reverse(sayilar);
        System.out.println("sayilar.reverse = " + sayilar);
        //Max ve Min eleman bulma
        System.out.println("sayilar max = " + Collections.max(sayilar));
        System.out.println("sayilar min = " + Collections.min(sayilar));

        //Butun elemanlara deger atama
        Collections.fill(sayilar,0);
        System.out.println("sayilar.fill = " + sayilar);

        //replaceall(eski degerler ile yeni degerlerle degistiriyor)
        Collections.replaceAll(sayilar,0,5);  //0 degerlere 5 degerini atiyor
        System.out.println("sayilar.replaceall = " + sayilar);

        //tanimlarken deger atama
        int[] dizi={2,3,4,5};
        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(3,4,5));
        System.out.println("liste = " + liste);
        ArrayList<String> strliste=new ArrayList<>(Arrays.asList("ahmet","mehmet","busra","roman"));
        System.out.println("strliste = " + strliste);

        ArrayList<Integer> liste2=new ArrayList<>();
        Collections.addAll(liste2,2,3,4,5,6,7,8,9,0);
        System.out.println("liste2aaa = " + liste2);

       /** ArrayList<String> liste3=new ArrayList<>();
        Collections.addAll(liste3,"asd","dsa");**/

        //diziyi direk ArrayList e nasil atilir
        Integer[] dizi2={2,3,4,5};
        ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(dizi2));  //asList-> list gibi
        System.out.println("list3 = " + list3);

        /**
        int-> sadece sayi saklayabilen basit tip
         Integer-> hem sayi sakliyor, hemde kendi ozgu metodlari var
         **/


        // Array i ArrayListe dönüştürebiliriz

        String[] arr = {"Java", "Python", "C++"};

// 1.yöntem
        ArrayList<String > list1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list1);

// 2.yöntem
        ArrayList<String> list2 = new ArrayList<>();

        for (String i : arr ){
            list2.add(i);
        }
        System.out.println("listeye atılmış hali: " + list2);

//************************************************

// ArrayListi Arraye dönüştürelim.

        ArrayList<String> diller = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));


        String[] arr1 = new String[diller.size()];

//1.yöntem
// diller.toArray(arr1); // diziye döndürmüş olduk.
// System.out.println("dizi hali: " + Arrays.toString(arr1));

//2.yöntem
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = diller.get(i);
        }
        System.out.println("ikinci yöntem ile atama: " + Arrays.toString(arr1));








    }
}
