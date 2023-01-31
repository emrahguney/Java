package Gun20;

public class _01_JavaMethod {
    public static void main(String[] args) {

        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");


        merhabaYaz(); //giden yok, donen yok
       toplamYaz(4,5); //giden var, donen yok (fonksiyonu bir seye esitleyebilirmisin) //Bunu calistirdiginda(toplamYaz(4,5);) bana bir sonuc vermiyor bir seye esitleyemiyorum
        Math.max(8,5);  //giden var ,donen var (fonksiyonu bir seye esitleyebilirmisin)     //DONEN BIRSEY VARSA RETURN ILE GONDERILIR

        double sayi=Math.random(); // gideni yok, donen var
// () ici bossa giden yok dolu ise giden var;   fonksiyonu bir seye esitleyebiliyorsan donen var fonksiyonu bir seye esitleyemiyorsan donen yok

        enbYaz(4,5);
     int enbuyuk= enbBul(4,5);     //enbYaz ile enbBul aslinda bize ayni sonucu veriyor. enbYazda direk sonucu yaziyor enbBulda enb=sayi olarak veriyor
                                        //enb=sayi olarak buraya yazdirmak istersek; burada giden var donende var onun icin asagidaki maininde islemi yapip sonucu returnlemek lazim yoksa hata verir
        // ve bir tip gondereksek hangi tip gonderdigimizi asagidaki mainde yazmamiz lazim public static int enbBul(int a, int b) olacak sekilde yazmamiz lazim ne gonderdigimizi anlasin diye

       System.out.println("enbuyuk="+enbuyuk);

       //fonksiyonda return oldugu icin mainde yazdirabiliyoruz, yani fonksiyonun sonucunu alabiliyoruz


    }

    public static int enbBul(int a, int b)//donecek tip     //DONENLERDE VOID KISMINI SILEREK GONDERCEGIMIZ PARAMETRENIN CINSINI YAZARIZ
    {     String enb="enb=";                                                  //NEYI DONDURUYORSAN YAZABILIRSIN
        int gonderileceksayi=0;
        if (a>b)
            gonderileceksayi=a;
        else gonderileceksayi=b;
        System.out.println(enb + gonderileceksayi);
        return gonderileceksayi; //donecek deger

// void (geri deger dondurmeyen) return ise cagirildiginda bir deger donduren demektir.
//ortalama buldunuz ve siz bu sonucu bir yerde kullanmayacaksaniz  void yaparsiniz.
// Eger ortalamayi bir de ayrica bir isleme tabi tutacaksaniz onu bir degiskene atmalisiniz ki o degeri return etsin.
// yani dondurmesi lazim size ki islem yapabilesiniz.

    }
    public static void  enbYaz(int a, int b){

        if (a>b)
            System.out.println(a);
        else System.out.println(b);
//enbBul(a,b);
    }

    public static void toplamYaz(int a, int b)
    {

        System.out.println("toplam="+(a+b));
        enbYaz(a,b);
    }

    public static void merhabaYaz()

    {
        System.out.println("Merhaba Dunya" );
    }

}


