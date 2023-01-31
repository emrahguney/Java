package Gun07;

public class _01_StringEquals_Tekrar {
    public static void main(String[] args) {

        String s1="merhaba";
        String s2="Merhaba";

        boolean esitmi=s1.equals(s2);
        System.out.println("ESITMI = " +s1.equals(s2) );

        System.out.println("esitmi = " + s1.equals("merhaba"));
        
    }
}
