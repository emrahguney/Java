package Gun07;

public class _01_StringEquals {
    public static void main(String[] args) {
        //equals= esittir anlamina gelir

        //equals=2 stringin birbirine esit olup olmadigini kontrol eder
        //sonuc boolean

        String s1="merhaba";
        String s2="Merhaba";

           boolean esitmi=s1.equals(s2) ; //manasi; s1 esitmi s2 ye
        System.out.println("esitmi = " + esitmi);

        //2.yol
        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        //Farkli bir karsilastirma
        System.out.println("s1.equals(merhaba) = " + s1.equals("merhaba"));

    }
}
