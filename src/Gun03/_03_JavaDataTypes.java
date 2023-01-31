package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {

        int sayi; // hafizada int kadar yer ayiriyor, sadece tam sayi atilabiliyor.
        // tam sayilarda default INT dir. INT i baz aliyor
        // ondalik sayilarda default DOUBLE dir. DOUBLE i baz aliyor


        //TAM SAYILAR
        //tam sayilarda default INT dir. INT i baz aliyor.
        byte byteDeger = 7; //-128... 127
        short shortDeger = 1645; //-32000 ... 32000
        int intDeger = 250000;
        long longDeger = 232032322231L; // int i baz alindigindan sayi buyuk oldugundan sonuna L yazmamiz lazimki
        // ya sayiyi kisaltiriz int kadar kisaltiriz yada uzun tutcaksak sayiyi sonuna L
        // yazmamiz lazim.


        //ONDALIKLI SAYILAR
        //ondalikli sayilarda default DOUBLE dir. DOUBLE i baz aliyor

        double doubleDeger = 3.1424242422242; // noktadan son 16 hane duyarlidir
        float floatDeger = 3.1442424F; //noktadan sonra 7 hane duyarlidir

        //KARAKTER VE KARAKTERLER

        char basHarf = 'A'; //bir tane karakter saklayabilir. Bir tane karakter icin tek tirnak yapiliyor
        String isim = "emrah"; // kelime veya cumle saklayabilir

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("isim = " + isim);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);


    }
}
