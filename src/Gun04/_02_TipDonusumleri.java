package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogrNot1=98;
        byte ogrNot2=98;
        byte ogrNot3=100;
        byte ogrNot4=98;

        int toplamNot=ogrNot1; // byte -> int atinca problem cikarmadi(GENISLETME-Widening Casting)
        //cunku byte icin hafizada ayrilan, zaten int e sigar, sigdigi icin kabul ederim.
        //cunku veri kaybi olma ihtimali hic yok.

        ogrNot1=(byte)toplamNot;
        //ogrNot1=toplamNot olsaydi kabul olmazdi
        //int -> byte a atinca dur bakalim dedi (DARALTMA - Narrow Casting)
        //buyuk hafiza ayrilmis bir alani, kucuk hafiza ayrilmis alana atma islemi var.
        //veri kaybi ihtimali olabilir
        //daraltmak istiyorsan basina neye cevirmek istiyosan onu yazman lazim


        int Not=(byte)ogrNot1+(byte)ogrNot2+(byte)ogrNot3+(byte)ogrNot4;

        System.out.println("Not = " + Not);

                 /*
                        DEGERLER
                    byteMinDeger = -128
                    byteMaxDeger = 127
                    shortMinDeger = -32768
                    shortMaxDeger = 32767
                    intMinDeger = -2147483648
                    intMaxDeger = 2147483647
                    longMinDeger = -9223372036854775808
                    longMaxDeger = 9223372036854775807
                    floatMinDeger = 1.4E-45
                    floatMaxDeger = 3.4028235E38           */
        /*Widening Casting(GENISLETME) e gore kucukten buyuge dogru siralanis;
         byte->short->int->long->float->double

         Narrowing Casting(DARALTMA) e gore buyukten kucuge dogru siralanus;
         double->float->long->int->char->short->byte*/

    }
}
