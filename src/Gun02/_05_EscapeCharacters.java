package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        //Escape Karakterler nelerdir
        //  \n -> yeni satır açıyor, alt satıra geçiyor
        //  \t -> sanki tab tuşuna basılmış gibi boşluk veriyor
        //  \b -> back-space bir karakter geri siler
        //  \" -> " tırnak yazmak için kullanılıyor
        //  \\ -> \ yazılacak ekrana
        //  \r -> satır başına geri ve satırı silip tekrar baştan yazıyormuş gibi yapar

        System.out.println("Merhaba Dunya"); // MerhabaDunya
        System.out.println("Merhaba\nDunya"); //Merhaba alt satira gecer Dunya
        // print veya println \ gorunce bu ekrana yazilacak bir karakter degil,
        // ayri bir is yapmam isteniyor, devam eden n karakterini gorunce
        // ayri isin alt satira gecmek oldugunu anliyor
        System.out.println("Merhaba\tDunya"); // Merhaba    Dunya
        System.out.println("Merhaba\bDunya"); // MerhabDunya
        System.out.println("\"Merhaba\" \"Dunya\""); // "Merhaba" "Dunya"
        System.out.println("Merhaba\\Dunya"); // Merhaba\Dunya
        System.out.println("Merhaba\rDunya"); // Dunya





    }
}
