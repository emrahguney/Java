package Gun07;

public class _12_StringReplaceFirst {
    public static void main(String[] args) {
        //replace= bir string icindeki karakter(leri) verilenle degistirir. Sadece ilkini degistirir birden fazla degistirmez.
        
        String text="Merhaba Dunya";

        System.out.println("text.replaceFirst(\"a\",\"e\") = " + text.replaceFirst("a","e"));
        System.out.println("text.replaceFirst(\"b\",\"D\") = " + text.replaceFirst("b","D"));
        System.out.println("text.replaceFirst(\"M\",\"y\") = " + text.replaceFirst("M","y"));
        System.out.println("text.replaceFirst(\"a\",\"\") = " + text.replaceFirst("a","")); //ilk a yi siliyor
        System.out.println("text.replaceFirst(\"a\",\" \") = " + text.replaceFirst("a"," ")); //ilk a yerine bosluk koyar
    }
}
