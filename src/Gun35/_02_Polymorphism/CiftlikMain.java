package Gun35._02_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {
//Polymorphism= cok formluluk, cok cesitlilik

        Kopek kopek1=new Kopek("karabas");
        kopek1.ses();//havladi
        kopek1.kokladi();//kokladi

        Kedi kedi1=new Kedi("kopuk");
        kedi1.ses();//miyavladi
        kedi1.tirmaladi();//tirmaladi

        kopekSesi(kopek1);//havladi
        kediSesi(kedi1);//miyavladi

        hayvanSesi(kopek1);//havladi,kokladi(ozel method)
        System.out.println("-------------*********------------");
        hayvanSesi(kedi1);//miyavladi,tirmaladi(ozel method)

        //  aşağıda Hayvan classından türettiğimiz-extend yaptığımız için
        //  hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
        //  köpek ve kedi için classlarında Override yaparak yazdığımız
        //  özellikleri alarak yazdı.
        //  Ama tırmaladı , kokladı gibi kedi, köpek classına özel olarak
        //  yazdıklarımızı hayvanSesi methodunda yazdıramayız.cunku ozel method



      //Referans tipi  //nesne tipi
        Hayvan hayvan1=new Hayvan("ordek");//hayvanlardan 1 hayvan
        Hayvan hayvan2=new Kopek("kangal");//hayvanlardan 1 kopek
        Hayvan hayvan3=new Kedi("tekir");//hayvanlardan 1 kedi





        System.out.println("----------------------------------------------------------");

        hayvan1.ses();//ses cikardi//genel hayvan
        hayvan2.ses();//havladi//kopek hayvan
        hayvan3.ses();//miyavladi//kedi hayvan

        hayvan2.ses();//kopek de olsa hayvan Referansi sebebiyle metodlar kisitli






        //hayvan2 nin kendine ozel metodlarina ulasamiyoruz sadece kokladi metoduna ulasabiliyoruz
        //yani sadece hayvana ait metodlara ulasabiliyoruz cunku Hayvan hayvan2 olarak tanittigimiz icin
        //suan Hayvan konumunda(Referans tipi Hayvan oldugu icin) oldugu icin diger hayvan2 ye ait ozel metodlarini cikaramiyoruz
        //peki bu hayvani kopek formunu nasil ortaya cikartirim
        //tip donusumu acaba isime yararmi asagidaki gibi yazarsak ortaya cikar
        System.out.println("***********************************");


  /***/ ((Kopek)hayvan2).kokladi();//artik diger metodlari kullanabilirim
       // ((Kedi)hayvan2).tirmaladi(); //boyle yazarsan hata verir(Kopek cannot be cast to Gun35._02_Polymorphism.Kedi at Gun35._02_Polymorphism.CiftlikMain.main)

        ((Kedi)hayvan3).tirmaladi();


        /**System.out.println("amaaaaaa!!!! aşağıdaki gibi dönüşüm yaparsan");
         ((Kopek)hayvan2).kokladi(); //tip dönüşümü yaptık ve artık kokladı çıktı.
         //((int)Math.random()) casting burdaki gibi tip dönüşümü
         ((Kedi)hayvan3).tirmaladi();//tip dönüşümü yaptık ve artık tırmaladı çıktı*/

        //((int)Math.Random()) casting burdaki gibi, tip donusumu
        // Setlerden HasSet
        // Maplerden HashMAp
        // Listlerden ArrayList

//        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.
    }
    public static void kopekSesi(Kopek kopek){
        kopek.ses();
    }

    public static void kediSesi(Kedi kedi){
        kedi.ses();
    }


    public static void hayvanSesi(Hayvan hayvan){
        //buraya hem kedi geliyor hem kopek geliyor
        hayvan.ses();

        //bir classin aslinda kim oldugunu bulma yontemi
        //instance of= "ornegi" anlamina geliyor
        if (hayvan instanceof Kopek)//hayvan aslinda kopekmi  /hayvanin ornegi kopek ise
        { ((Kopek)hayvan).kokladi();
            }


        if (hayvan instanceof Kedi)//hayvan aslinda kedimi      //hayvanin ornegi kedi ise
            ((Kedi)hayvan).tirmaladi();

    }

}
