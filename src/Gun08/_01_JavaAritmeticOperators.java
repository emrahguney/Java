package Gun08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {
            int a=9;
            int b=5;
            int x=34, y=4, z=2; //ayni veri tipi oldugu icin bu sekilde tanimlayabiliriz
        System.out.print("Toplama islemi =" );
        System.out.println("a+b=>  "+(a+b)  );  //a+b yazarsan string olarak algilar ve yanyana yazar yani 95 olarak yazar(otomatik casting ile 95 olarakgelir.
                                                // Paranteze alirsak islem olarak derler

        System.out.print("Cikartma islemi = " );
        System.out.println("a-b => "+(-b) );

        System.out.print("Carpma islemi => " );
        System.out.println("a*b = "+(a*b) );


        System.out.print("Bolme islemi => ");
        System.out.println("a/b = "+(a/b) );  //normal sonuc 1.8 fakat tam sayinin tam sayiya bolumunde kusurat atilir
                                              //bu sebeple sonuc 1 olur yuvarlama yapmaz.cunku int/int
                                              //tam sonuc istersen bir tanesini double cevirmen yeterli
        System.out.println("(double)a/b = "+((double)a/b) );
        System.out.println("(double)a/b 2 = " + (double)a/b);

        System.out.println("Modul islemi = " );//11/4->2 bolum yani sonucu verir sonucu bolume gore verir
                                               //11%4->3 kalani verir sonucu kalana gore verir
                                                //modul(%) de sol buyukse kalani al sol kucukse solundakini al
        System.out.println("a%b = " + (a%b));
        System.out.println("(b%a) = " + (b%a));

        System.out.println("(x+y+z) = " + (x+y+z));

    }
}
