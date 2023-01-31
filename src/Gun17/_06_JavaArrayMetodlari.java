package Gun17;

import java.util.Arrays;

public class _06_JavaArrayMetodlari {
    public static void main(String[] args) {
        String[] isimler={"ahmet","zeynep","roman","yasin","cihan"};

        //diziyi string olarak direk yazdirir
        System.out.println("isimler = " + Arrays.toString(isimler));    //isimler = [ahmet, zeynep, roman, yasin, cihan]

        //dizi siralama harf sirasina gore
        Arrays.sort(isimler);
        System.out.println("isimlerdsa = " + Arrays.toString(isimler));    //isimler = [ahmet, cihan, roman, yasin, zeynep]

        //Diziler esitmi?
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,2,54};

        System.out.println("a,b equals = " + Arrays.equals(a,b));   //true
        System.out.println("a,c equals = " + Arrays.equals(a,c));   //false
        
        Arrays.sort(c); //sayi bazli dizi siralamasi //sayilari dizi olarak siraliyor
        System.out.println("c = " +Arrays.toString(c)); //c = [1, 2, 8, 54]
        
        //contains gibi calisir, var ise pozitif bir deger dondurur, yok ise negatif
        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b,3));   //Arrays.binarySearch(b,3) = -2
        Arrays.sort(b); //ancak siralanmis dizilerde dogru sonuc verir

        System.out.println("Arrays.binarySearch(b,3) = " + Arrays.binarySearch(b,3));   //Arrays.binarySearch(b,3) = 1
        

    }
}
