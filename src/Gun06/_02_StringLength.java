package Gun06;

public class _02_StringLength {
    public static void main(String[] args) {
        //String yani kelime islemleri, cok kullanilan islemlerdir.
        // 0 216 2563258, stringler bölünmesi, istenilen kısmın alınması,
        // uzunluğu,    ** 4566 , Ismet Temur -> I.T.

        String cumle="Bugun havalar sogudu";

        int uzunluk=cumle.length();//cumlenin uzunlugu cumlenin sonundaki nokta isareti nIn nin eki gibidir

        System.out.println("uzunluk = " + uzunluk);
        System.out.println("uzunluk 2 = " +cumle.length() );
        System.out.println("cumle.toUpperCase() = " + cumle.toUpperCase());
    }
}
