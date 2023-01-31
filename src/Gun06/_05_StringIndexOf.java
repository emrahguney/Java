package Gun06;



public class _05_StringIndexOf {
    public static void main(String[] args) {
        //01234 : harflerin oda numaralari 0 dan baslar:index.
        //  ^
        //  |
        //Bugun

        String cumle="Merhaba Dunya";
        //D nin index i kactir
        //M nin index i kactir
        //0(506)3445567 ->( in oda numarasi kactir
        //Verilen karakter(ler)in string icindeki INDEX ini verir

        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M"));
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a"));
        System.out.println("cumle.indexOf(ha) = " + cumle.indexOf("ha"));
        System.out.println("cumle bosluk= " + cumle.indexOf(" "));
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A"));
        System.out.println("cumle.indexOf(a,5) = " + cumle.indexOf("a",5));

    }
}
