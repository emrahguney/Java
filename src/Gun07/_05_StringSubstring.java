package Gun07;

public class _05_StringSubstring {
    public static void main(String[] args) {
        //cok kullanilan bir komuttur
        //Stringin belli bir bolumunu alma islemini yapar

        String s1="Merhaba Dunya";

        String parca1=s1.substring(3,9); //3 nolu indexten 9 nolu indexe kadar,9 dahil degil ama 3 dahil
        System.out.println("parca1 = " + parca1);

        String s2="Merhaba arkadaslar";
        String parca2=s2.substring(8,15);//8 dahil 15 e kadar 15 dahil degildir yazar
        System.out.println("parca2 = " + parca2);

        String parca3=s2.substring(8); //8 den sonra sonuna kadar yazar(8 dahil)
        System.out.println("parca3 = " + parca3);

    }
}
