package Gun02;

public class _05_EscapeCharacters_Tekrar {
    public static void main(String[] args) {
        //Escape Characters
        /*  \n -> yeni satir aciyor
            \t -> sanki tab tusuna basilmis gibi bosluk veriyor
            \b -> back- space(enter tusunun ustundeki silme tusu) bir karakter geri siler
            \" -> " tirnak yazmak icin kullaniliyor
            \\ -> \ yazilacak ekrana
            \r -> satir basina geri ve satiri silip tekrar bastan yaziyormus gibi yapar
      */


        System.out.println("MerhabaDunya"); //MerhabaDunya
        System.out.println("Merhaba\nDunya"); //Merhaba alt satira gecer Dunya

        // print veya println "\" gorunce bu ekrana yazilacak bir karakter degil, ayri bir is yapmam isteniyor,
        // devam eden n karakterini gorunce ayri isin alt satira gecmek oldugunu anliyor
        // \n gibi karakterlere escape karakterler denir

        //Escape karakterlerin ornekleri;
        System.out.println("Merhaba\tDunya"); // Merhaba   Dunya
        System.out.println("Merhaba\bDunya");  //MerhabDunya
        System.out.println("Merhaba\"Dunya");  //Merhaba"Dunya
        System.out.println("Merhaba\\Dunya");  //Merhaba\Dunya
        System.out.println("Merhaba\rDunya");  //Dunya
        System.out.println("Merhaba\nDunya"); //Merhaba alt satira gecer Dunya





    }
}
