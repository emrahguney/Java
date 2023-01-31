package Gun32._02_Encapsulation;

public class ArabaMain {
    // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
    // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
    // Main de 1 tane nesne oluşturup bunu kontrol ediniz.

    public static void main(String[] args) {

        Araba araba=new Araba();
        araba.setRenk("mavi");
        araba.setModel(2000);
        araba.setMotorhacmi(2000);
        araba.setKapiSayisi(4);

      //  System.out.println(araba.getRenk()+" "+araba.getmodel()+" "+araba.getMotorhacmi()+" "+araba.getKapiSayisi());
        System.out.println("araba = " + araba);

        Araba araba2=new Araba("mavi",2030,1600,4);
        System.out.println("araba2 = " + araba2);


        araba2.setMotorhacmi(4000);
        int motorhacmi=araba2.getMotorhacmi();
        System.out.println("MH="+motorhacmi);
        System.out.println("new araba2="+araba2);
    }
    // KURAL: genel yazılım kuralıdır.
    // bütün değişkenler private yapılır.
    // yani Kapsulleme ile kullanılır.
    // Eğer gerekiyorsa private kaldırılır.


}
