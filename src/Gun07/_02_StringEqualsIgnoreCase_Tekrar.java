package Gun07;


public class _02_StringEqualsIgnoreCase_Tekrar {
    public static void main(String[] args) {
        String s1="merhaba";
        String s2 ="MERHABA";
        //equalsignorecase= buyuk kucuk ayrimi yapmadan kontrol eder
        System.out.println("s1 = " + s1.equalsIgnoreCase(s2));
        System.out.println("s2 = " + s1.equalsIgnoreCase("MeRhaBa"));



    }
}
