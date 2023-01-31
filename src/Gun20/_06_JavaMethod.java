package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1 = 45;
        int s2 = 4;
        int s3 = 67;
        int s4 = 23;
        int s5 = 23;
        int sonuc1 = toplamBul("qwe",s1, s2);
        int sonuc2 = toplamBul("ewq",s1, s2, s3);
        int sonuc3 = toplamBul("www",s1, s2, s3, s4,s5);

        String X="X";  String Y="Y"; String Z="Z";
        xxx(X);

    }
        //gelen kac sayi olursa olsun hepsini al dizi seklinde metoda al


    // ... ile ilgili 2 kural var
    //1-Bir metodda parametre olarak sadece 1 tane olabilir.
    //2- Herzaman son parametre olmali
    //gelen kac sayi olursa olsun hepsini al dizi seklinde metoda al
    public static int toplamBul(String isim, int... sayilar) {// kac sayi gelirse gelsin onlari dizi seklinde aliyor
        int bol=2;                                            //siradan bakip(String isim) ilk sirada ne varsa ona gore eslestirilir  kalanlari kendine(int... sayilar) eslestiriyor
                                                      //String isimi 1 .siradakine, int a 2. siradakine geriye kalan ne kadar int sayi varsa hepsini int... sayilara dizi sekilde atar

        int toplam=0;
        for (int i = 0; i < sayilar.length ; i++) {
            toplam=toplam+sayilar[i];

        }

        return toplam;

    }
    /**STRING DE OLAMIYORMU? OLUYOR*/
    public static String xxx(String g,String... yyy){
        String a="a";
        String b="b";
        String c="c";
        System.out.println(a+"-"+b+"-"+c+"-"+g);

        return a;

    }




}



/* public static int toplamBul(int s1,int s2){
        return s1+s2;
    }

    public static int toplamBul(int s1,int s2,int s3){
        return s1+s2+s3;
    }

    public static int toplamBul(int s1,int s2,int s3, int s4) {

        return s1+s2+s3+s4;
}
*/

