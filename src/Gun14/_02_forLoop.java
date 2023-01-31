package Gun14;

public class _02_forLoop {
    public static void main(String[] args) {
        //1 den 5 e kadar olan sayilari ekrana yazdiriniz

        int i=1;        //i=sayac
        while (i <= 5) {
            System.out.println("w_i = " + i);
            i++;

            //while dongusu; dongunun kac kere donecegi belli olmayan durumlarda kullanacagiz

        }
        System.out.println( );
        //for dongusu, basi belli sonu belli artisi belli ise kullanilir
        for (i=1; i<=5; i++)
        {
            System.out.println("f_i = " + i);}
    }
}
/*          NOT
1- BASI BELLI SONU BELLI YANI KAC ADIM DONECEGI BELLI VE ARTIS MIKTARI BELLI ISE BU "FOR" DONGUSUDUR.
2- KAC KERE DONECEGI BELLI DEGIL ISE (KULLANICI 0 DEGERI GIRENE KADAR) "WHILE" DONGUSUDUR.
3- WHILE DONGUSUNDE DONGU KONTROLU ISLEMDEN SONRA ISE "DO-WHILE" DONGUSUDUR.




*/