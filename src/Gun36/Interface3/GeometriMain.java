package Gun36.Interface3;

public class GeometriMain {
    public static void main(String[] args) {
//bir interface i birden fazla classin implement alabilir
        Cember cember=new Cember();
        cember.ciz();
        Dikdortgen dikdortgen=new Dikdortgen();
        dikdortgen.ciz();


        //interface lerden nesne uretilemez fakat referans tipi olusturulabilir.
        //Bu bize Polymorphism sagladi
        ICizdirir c2=new Cember();
        c2.ciz();   //cemberin icindekilerine(implement ettiklerimize) ulasabiliriz

        ICizdirir c3=new Dikdortgen();
        c3.ciz();
        //dikdortgenin icindekilerine(implement ettiklerimize) ulasabiliriz
        //direk olarak sadece Interface deki ismi verilmis olanlar
        //metodlara erisebilirsin

        //Interface den parentCLASS uretilir genel olarak. sonra bundanda subCLASS lar uretilir. (INTERFACE-->PARENTCLASS--->SUBCLASS(BIRDEN FAZLA SUBCLASS OLABILIR))
        //BOYLECE PARENTCLASSIN NELERDEN OLUSMASI GEREKTIGI ORTAYA CIKMIS OLUR
        //Ama istersen  INTERFACE den direk SUBCLASSA DA YAPABILIRSIN

        /*INTERFACE 1 VE INTERFACE 2 YI ,IKISINI BIRLIKTE CLASS A DA ATABILIRSIN
         YANI BIR CLASSA BIRDEN FAZLA INTERFACE i IMPLEMENT YAPABILIRSIN.(extend de 1 den fazla olmaz ama implementte 1 den fazla olabilir)*/



        cizdirme(cember);
        cizdirme(dikdortgen);
    }

    public static void cizdirme(ICizdirir iciz){//parent class olmadigi icin ICizdirir i kullanabiliriz

        iciz.ciz();
    }
}
