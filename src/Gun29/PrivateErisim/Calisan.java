package Gun29.PrivateErisim;

public class Calisan {
    int id;         //default
    String name;     //default
    String surname;  //default
    private String password;     //private
    //sadece bulundugu classdan erisim izni var



    public void sifreAta(String sifre){

        //sifreyi kontrol ederek atayacagim
        if (sifre.length()<8){
            System.out.println("zayif sifre" );
        }
        else {
            password=sifre;
            //this yazmamiza gerek yok,farkli degiskenler oldugu icin.
            System.out.println("Sifre basariyla atandi");

        }

    }

    public void sifreGoster()
    {

        System.out.println("****"+password.substring(4) );
    }

}
