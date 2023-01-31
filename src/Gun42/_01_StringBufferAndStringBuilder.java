package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {

        String cumle="";

        cumle=cumle+"Bugun";
        cumle+=" hava";
        cumle+=" cok soguk";

        System.out.println("cumle = " + cumle);
        System.out.println("cumle.concat(\"fakat dun sicakti\") = " + cumle.concat("fakat dun sicakti"));
        System.out.println("cumle = " + cumle);

        cumle=cumle.concat("fakat dun sicakti");//concat de birlestirir, atama ister
        System.out.println("cumle = " + cumle);

        /*******************STRING BUILDER******************************/

        StringBuilder cumle2=new StringBuilder();
        cumle2.append("BUGUN");//append: ekle,atama gerektirmez, ekler
        cumle2.append(" HAVA");
        cumle2.append(" SOGUK");

        System.out.println("cumle2 = " + cumle2);

        /***** +,concat,StringBuilder 3 MODELIN HIZI TEST EDILECEK  **********/

        long startTime=System.currentTimeMillis();
        String test1="";
        for (int i = 0; i <10 ; i++) {
            test1=test1+"merhaba";
        }
        System.out.println("+ icin sure="+(System.currentTimeMillis()-startTime)+" ms" );

         /*-------------------------------------------------------------------------------*/
        startTime=System.currentTimeMillis();
         String test2="";
        for (int i = 0; i <10 ; i++) {

            test2=test2.concat("merhaba");
        }
        System.out.println("concat icin sure="+(System.currentTimeMillis()-startTime)+" ms" );
        /*-------------------------------------------------------------------------------*/
        startTime=System.currentTimeMillis();
        StringBuilder test3=new StringBuilder();
        for (int i = 0; i <10 ; i++) {

             test3.append(" merhaba");
        }
        System.out.println("StringBuilder icin sure="+(System.currentTimeMillis()-startTime)+" ms" );

        // Performans testi sonucu :
        //eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        //performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        /**-------------------------------------------------------------------------------*/

        //StringBuilder i biraz yakindan taniyalim//

        StringBuilder sb=new StringBuilder();
        sb.append("Bugun");//append=kendine ekleme, atama gerektirmez(concat de gerekirdi)
        sb.append(" hava");
        sb.append(" guzel");

        System.out.println("sb = " + sb);
        System.out.println("sb.length = " + sb.length());
        
        sb.append( 4);//eklenen her seyi toString hali var ise cevirerek ekler
        System.out.println("sb = " + sb);

        sb.reverse();//Stringi tersine cevirir
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);

        sb.delete(0,5);//(index)0 dahil ,5 haric olmak uzere siler
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3);//sadece belirtilen index deki karakteri siler
        System.out.println("sb = " + sb);
        
        sb.insert(5,"kelime"); //5 nolu index e kelime yi ekle
        System.out.println("sb = " + sb);

        
        sb=new StringBuilder(sb);
        System.out.println("sb = " + sb);
        
        sb=new StringBuilder("Bugun hava cok soguk");//sifirlandi ve ilk deger atandi
        System.out.println("sb = " + sb);
        
        sb.replace(3,8,"bu");// verilen araligi "bu" string ile degistir
        System.out.println("sb = " + sb);

        
        String strSb=sb.toString();//Stringe cevirdikd
        System.out.println("strSb = " + strSb);
        /* ******************************************************************** */
        StringBuffer buffer=new StringBuffer();//tamamen StringBuilder ile ayni
        //tek farki, paralel calisan yazilimlarda, StringBuffer kullanilir


    }
}
