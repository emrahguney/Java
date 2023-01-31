package Gun08;

public class _04_Soru1 {
    public static void main(String[] args) {
        //2022(dahil) yilina kadar gecen gun miktariniz bulunuz
        //1 yilda 365 gun var. 4 yilda 1->1 gun extra ekleniyor
        int gecengunmiktari=2022*365+(2022/4);
        System.out.println("gecengunmiktari = " + gecengunmiktari);
        int saatmiktari=gecengunmiktari*24;
        System.out.println("saatmiktari = " + saatmiktari);
        int dakika=saatmiktari*60;
        System.out.println("dakika = " + dakika);



    }
}
