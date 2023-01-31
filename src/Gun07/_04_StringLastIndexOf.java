package Gun07;

public class _04_StringLastIndexOf {
    public static void main(String[] args) {
        //indexof=aramaya bastan baslar
        //lastIndexOf ise=aramaya sondan baslar.

        String s1="Merhaba";
        System.out.println("s1.lastIndexOf(a) = " + s1.lastIndexOf("a"));//6
        System.out.println("s1.indexOf(a) = " + s1.indexOf("a"));//4
        //index herzaman tek sadece arama yonu degisir

        int yer=s1.lastIndexOf("a");
        System.out.println("a nin son yeri = " + yer);

    }
}
