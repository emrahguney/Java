package Gun15;

public class _07_DebugOrnek {
    public static void main(String[] args) {
        //PROGRAMIN NASIL CALISTIGINI GORMEK ICIN HANGI KODDA NASIL CALISITIGINA BAKMAK ICIN SOLUNDAKI RAKAMA TIKLA KIRMIZI YUVARLAK ISARETI
        //CIKACAK SONRA SAG TIK ILE DEBUG DIYIP F8 E TEK TEK BASIP NASIL CALISTIGINI TEK TEK GOSTERIYOR


        int a=10;

        a=1000;

        a+=5;

        System.out.println("a = " + a);
        // Programı adım adım çalıştırıp her satırdaki değerleri kontrol etmek
        // için başlaması istedğimiz yere breakpoint (kırmızı nokta) konur.
        // RUN yerine DEBUG seçilerek çalıştırılı.Program ilk olarak breakpoint de
        // durur ve F8 ile adım adım ilerletilir.Bu şekilde hem değerler izlenir
        // hemde nasıl çalıştığı test edilebilir.F9 ile bir break Pointten diğer
        // Break Pointe atlanabilir.
    }
}
