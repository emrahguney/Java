package Gun07;

public class _04_StringLastIndexOf_Tekrar {
    public static void main(String[] args) {
        //indexof=aramaya bastan baslar
        //lastIndexOf ise=aramaya sondan baslar.
        
        String s1="ADAM AKILLI OYNA";
        System.out.println("s1.lastIndexOf(\"A\") = " + s1.lastIndexOf("A"));
        System.out.println("s1.lastIndexOf(\"I\") = " + s1.lastIndexOf("I"));

        int Aninyeri=s1.lastIndexOf("A");
        System.out.println("Anin son yeri = " + Aninyeri);
        
    }
}
