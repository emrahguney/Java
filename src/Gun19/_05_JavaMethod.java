package Gun19;

public class _05_JavaMethod {

    //buraya metodlar yazilabilir

 /* burasi ana metod,diger metodlari buradan cagiracagiz*/   public static void main(String[] args)  {

     Math.max(5,6); //birseyler verilmis, geriye deger aliniyor
     Math.random(); //veri almiyor, sadece veri verir

     System.out.println("Merhaba Dunya" );
     System.out.println("Merhaba Dunya" );
     System.out.println("Merhaba Dunya" );

    merhabaYaz();
    merhabaYaz();
    merhabaYaz();       // main(ana metod) disinda hepsini boyle yazabiliyorsun
     gardasMerhaba();
     gardasMerhaba();
     gardasMerhaba();

    }public static void merhabaYaz(){   //burasi calisan kisim degil cagrilan kisim main icine yazip calisir o yuzden 6 tane yazdi
//void yerine= maine ne yollayacagiz
//parametre yerinede metoda neler yazicaz yazilir


        System.out.println("Hi World" );

    }public static void gardasMerhaba(){

        System.out.println("Whats up");
    }
    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için

    //burayada metodlar yazilabilir
}
//JAVANIN ICERISINDEKI KODLARI NASIL YAZILDIGINI GORMEK ICIN CTRL BASILI TUTUP KODUN UZERINE GELIP TIKLAYIP GOREBILIRSIN