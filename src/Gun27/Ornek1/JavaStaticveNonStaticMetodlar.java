package Gun27.Ornek1;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {

       int sayi=345;
        String strSayi=String.valueOf(sayi);    //int degerini stringe cevirme
        System.out.println("strSayi = " + strSayi);

        int intsayi=Integer.parseInt(strSayi);  //string degerini inte cevirme
         /** parse.int ve valueof yazinca direk mainin icinde yazilabiliyor cunku mainin icinde parseint, valueof, random vb gibi metodlar mainin icinde static olarak tanimli. CTRL ile bakilabilir*/
         /** static olduklari icin direk cagrilabiliyor asagidaki ornekteki gibi getstring ve getstring tanimlandi biri normal olarak digeri static olarak tanimli */
        System.out.println("intsayi = " + intsayi);

        Utility ut=new Utility();
        //burda utility bir class dir ut ise nesnedir
        //insan bir classdir erdem buke ise nesnedir
        //Araba BMW= new Araba();
        //Araba=class  BMW=nesne
           String strSayi1=ut.getString(sayi);
    //ut.getString2(sayi); cagiramayiz cunku getString2(sayi) classa ait birsey asagidaki gibi direk yazdirabiliriz
/*********************************************************************************************************************************/
        //Static metodlar zaten var olduklari icin
        //new ile yeni olusturulmaya ihtiyac duymazlar
        String strSayi2=Utility.getString2(sayi);   //public static yazinca direk yazdirabiliyoruz

        //Static sadece class a ait bir komut o zaman


    }
}
 /**Static ve Static olmayan metodların farkı ve kullanım amacı
-STATIC metodlar
 1)Başına static kelimesi getirilir
 2)Nesneyi değil GENEL i yani tüm nesneleri kapsayan, yani nesne
   bağımsız metodları nesne olusturmadan kullanmak için olusturulur.
 3)Bu metdolara Nesne özelinde değil , TİP e ait metodlar oldugu için
   TİP adı ile direk kullanılabilirler.
 4)Buna uygun Java da var olan örnek static metodlar Math.random gibi
   veya Integer.parseInt() gibi fonksiyonlardır.

-STATIC olmayan metodlar
 1)Bu metdolar nesne özelinde çalışan metodlardır.
 2)Nesne özelind enesneye ait değerlerle çalışmak zorunda olduğu için
   mutlaka new ile nesne oluşturulup. Nesne değişkeni ile kullanılırlar.


Yani, nesne özelliklerine ihtiyaç duyarak çalışacak metodlar normal metodlardır.
      nesne özelliklerine ihtiyaç duymayarak çalışacak metdoları geneli ilgilendirdiği için
            TİP e ait olması gerektiğinden başına static koyularak direk TİP adı ile birlikte
            kullanılırlar.*/

        /*
        class Insan{  Insan={class,tip,tasarim,model,soyut}

        gozrengi
        boy
        agirligi

        konusur()
        dinler()
                                }

           Insan Ismet=new Insan(); //Ismet:nesne,object,somut

           Ismet.gozrengi=kahverengi
           ismet.boy=166


         */
