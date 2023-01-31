package Gun07;

public class _02_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        //equals ayni calisir sadece buyuk kucuk harf ayrimi yapmaz

        String s1="Merhaba";
        String s2="MERHABA";
        boolean esitmi=s1.equalsIgnoreCase(s2);
        System.out.println("esitmi = " + esitmi);

        //2.yol
        System.out.println("ESITMI = " + s1.equalsIgnoreCase(s2));//true(buyuk kucuk harf ayrimina bakmaz)



        System.out.println("Esitmi = " + s1.equals(s2));//false(buyuk kucuk harf ayrimina bakar)

    }
}
