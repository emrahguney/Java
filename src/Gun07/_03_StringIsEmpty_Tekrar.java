package Gun07;

public class _03_StringIsEmpty_Tekrar {
    public static void main(String[] args) {
        //isEmpty=Bir stringin icinde birsey varmi yokmu boolean olarak verir
        String s1="merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty());
        String s2="";
        System.out.println("s2 = " + s2.isEmpty());
        String s3=" "; //bosluk karakteride bir karakterdir
        System.out.println("s3.isEmpty() = " + s3.isEmpty());

    }
}
