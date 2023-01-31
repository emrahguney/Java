package Gun26._02_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        //           çalıştığında kişinin doğum yılını versin.
        // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.


//Person; tip adi dir

        Person cal1=new Person();
        cal1.name="Emrah";
        cal1.surName="Guney";
        cal1.age=29;

        Person cal2=new Person();
        cal2.name="Erdem";
        cal2.surName="Buke";
        cal2.age=22;

      /*  //1. yontem: sout ile tek tek amele gibi yazariz

        //2. yontem:normal metod
        BilgiYazdir(cal1);
        BilgiYazdir(cal2);  */

        //3.yontem metodu ait oldugu class dan cagiriyoruz
        cal1.bilgiYazdir();
        cal2.bilgiYazdir();

        //4. yontem
        System.out.println("cal1 = " + cal1);//toString metodu ile direk yazdirabildik. cal1.toString yazmamiza gerek kalmadi

        cal1.getBirthYear();    //returnsuz
        System.out.println(" cal2 "+cal2.getBirthYear2());  //returnlu

        cal1.getInitials();

    }
    public static void BilgiYazdir(Person cal){
        System.out.println("name = " + cal.name);
        System.out.println("surName = " + cal.surName);
        System.out.println("age = " + cal.age);

    }
}
