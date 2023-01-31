package Gun07;

public class _09_StringToLowerCase {
    public static void main(String[] args) {
        //toLowerCase= stringi kucuk harfe cevirir.
        
        String text="Merhaba DunYA";

        System.out.println("text.toLowerCase() = " + text.toLowerCase()); //merhaba dunya
        System.out.println("text = " + text);    //Merhaba DunYA

        System.out.println("me ile veya ME ile basliyormu = " + text.toLowerCase().startsWith("me"));
        System.out.println("text.toLowerCase().startsWith(\"mer\") = " + text.toLowerCase().startsWith("mer"));

        System.out.println("text = " + text); //kendisine atama yapmazsak kendisi degismez ilk basta String text de ne yazdiysak onu yazar


    }
}
