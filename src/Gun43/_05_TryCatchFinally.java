package Gun43;

public class _05_TryCatchFinally {
    public static void main(String[] args) {

        long startTime=0;
        String str="";

        try {
            startTime=System.currentTimeMillis();

            System.out.println("Hatadan onceki kisim");
            char ilkHarf=str.charAt(0);// burda hata oldugundan bir alttaki sout u yazmiyor
            System.out.println("Hatadan sonraki kisim");
            //hata olma olasiliginin oldugu kodlar
        }

        catch (Exception ex)
        {
            System.out.println("catch blogu calisti");
            //hata oldugunda yapilacaklar
        }


        finally
        {
                long gecenSure=System.currentTimeMillis()-startTime;
                System.out.println("gecen sure="+gecenSure);
            //hata olsada calisir, olmasada calisacak kisim.Bu bolum yukaridaki surecle oldugunu gostermek icin finally icinde yazilir
                System.out.println("try-catch bloguyla ilgili son yapilacaklar");
        }

        System.out.println("Diger calisan kodlar");
        System.out.println("Program sonu");

    }
}
