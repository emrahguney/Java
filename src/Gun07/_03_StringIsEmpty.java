package Gun07;

public class _03_StringIsEmpty {
    public static void main(String[] args) {
        //isEmpty=Bir stringin icinde birsey varmi yokmu boolean olarak verir

        String s1= "Merhaba";
        boolean bosmu=s1.isEmpty();
        System.out.println("bosmu = " + bosmu);

        System.out.println("s1.isEmpty() = " + s1.isEmpty());//false

        String s2=" "; //bosluk karakteride bir karakterdeir A gibidir yani
        System.out.println("s2.isEmpty() = " + s2.isEmpty());//false

        String s3="";//burda hicbirsey yok,yani bos, yani empty
        System.out.println("s3.isEmpty() = " + s3.isEmpty());//true
    }
}
