package Gun05;

import java.util.Scanner; //Scanner icin bu kod olmali genelde Scannerii yazinca kod otomatik geliyor.

public class _01_JavaScanner_Tekrar {
    public static void main(String[] args) {

        //tipi      adi   ilk degeri    islem tamam  bu adimi calistir
        int        sayi=    5               ;


        //Scanner tanimlarken bir tane okuyucu tanimlayacagimilk once.
        //okuma islemini yapmadan once bir tane okuyucuyu yapacak bir islemi tanimlamam gerekiyor
        //bunun tipi Scanner dir S harfi buyuk olmalidir anlami okuyucu,tarayici manasina gelir.

        Scanner okuyucu= new Scanner(System.in);
        //
        //nasil ki int sayi=0 tanimlaniliyor ya bir degiskeni tanimlarken bu scanner ida boyle tanimliyoruz.
            //bu kodda new kelimesi yeni bir tane olusturacagimiz icin kullaniriz.Bir tane scanner olustururuz.
                //parantez icinde nerden okuyacagimizi yaziyoruz.Burda klavyeden okuyacagimiz icin System.in dedik
        //Scanner=tipi
        //okuyucu=adi
        //new Scanner=yeni okuyucu
        //System.in=klavyeden, konsoldan oku

        //suan bir tane okuyucuyu tanimladik henuz daha kullanmadik

        //simdi nasil kullanildigini gosterirsek;
        System.out.print("Sayi giriniz=");// bunu yazmassak kursorde sadece rakam gireriz.Bu kod kursor niye yanip sonuyor veya ne girmemizi istedigini soyluyor
                            //Bunu yazarsak sayi giriniz= kursorde boyle yazi cikar ve bunun yanina sayi yazariz
                            //bu kodda kursor altta kaldi eger kursoru yana alip yazmak istersek kodu System.out.print
                            //boyle yazmamiz gerekiyo System.out.print("Sayi giriniz=");
        sayi=okuyucu.nextInt(); //sayi okuyacagimiz icin nextInt dedik.Suan klavyeden okumak icin bekliyor
                                //ekranda kursor yanip sonuyor yani bekliyor sayi girisi icin
                                //kursore rakam girilip entera basildiginda degeri alip sayiya atiyor.



        System.out.println("sayi= "+sayi );

        //Disardan veri girisi oldugunda, konsoldan diyince,kullanicidan al diyince,girilen diyince akla hemen scanner gelmelidir



    }
}
