package Gun05;


import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        //tipi    adi        ilk degeri    islem tamam bu adimi calistir
         int    sayi;      //= 5           ;

        Scanner okuyucu= new Scanner(System.in);
        //tipi   adi     yeni okuyucu(klavyeden-konsoldan)

        System.out.print("Sayi giriniz=");

        sayi=okuyucu.nextInt(); //kursor bekliyor sayi girisi icin rakam girilip entera basildiginda degeri alip sayiya atiyor.
        System.out.println("sayi = " + sayi);
    }
}
