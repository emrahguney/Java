package Gun04;

public class _04_NarrowingCasting_DARALTMA {
    public static void main(String[] args) {

        double oran=3.2;
        int sayi=5;


        sayi=(int)oran;         //tehlikeli islem yapiyorsun, bundan dolayi challenger patladi
                                //degerlere bak, eger olusan veri kaybini anladiysan ve kabulunse bana bunu bilerek
                                //yaptigini goster.
                                //buyuk bir alani, kucuk alana atiyorsun
                    /*buyuk alan kaplayan bir seyi kucuk alana atarsan bu bislem tehlikeli islem yapiyorsub diyor sana
                    degerlere bak , eger olusan veri kaybini anladiysan ve kabulunse bana bunu bilerek yaptigini goster
                    basina neye donusturdugunu goster diyor*/
        System.out.println("sayi = " + sayi);
        byte kisaKenar=5;
        byte uzunKenar=7;

        byte cevre=(byte)(kisaKenar+uzunKenar+kisaKenar+uzunKenar);
        System.out.println("cevre = " + cevre);

        //sen esitligin 2. tarafi rakamlar toplandi, benim toplam burada INT durumunda byte cevre=5+7+5+7;
        //int degerini -> byte a atmaya calisiyorsun
        // eger veri kaybi olmayacagindan eminsen veya veri kaybi onemli degilse bana bunu yazarak goster

        int cevre2=kisaKenar+uzunKenar+kisaKenar+uzunKenar;// alternatif
        System.out.println("cevre2 = " + cevre2);




    }
}
