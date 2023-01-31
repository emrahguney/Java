package Gun07;

public class _11_StringReplace {
    public static void main(String[] args) {
        //replace= bir string icindeki karakter(leri) verilenle degistirir.Hepsini degistirir
        
        String text="Merhaba Dunya";

        System.out.println("text="+text);
        System.out.println("text.replace(\"a\",\"e\") = " + text.replace("a","e")); //Merhebe Dunye
        System.out.println("text.replace(\"ba\",\"de\") = " + text.replace("ba","de")); //Merhade Dunya
        System.out.println("text.replace(\"Merhaba\",\"Java\") = " + text.replace("Merhaba","Java")); //Java Dunya
        System.out.println("text.replace(a,'') = " + text.replace("a","")); //Merhb Duny->a lar silindi
        
    }
}
