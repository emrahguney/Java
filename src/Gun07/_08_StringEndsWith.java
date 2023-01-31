package Gun07;

public class _08_StringEndsWith {
    public static void main(String[] args) {
        
        //EndsWith=verilen karakter(ler) ile bitiyormu. sonuc true veya false yani boolean doner
        
        String oku="Merhaba Dunya";

        System.out.println("oku.endsWith(ya) = " + oku.endsWith("ya")); //true
        System.out.println("oku.endsWith(b) = " + oku.endsWith("b"));   //false
        System.out.println("oku.endsWith(nya) = " + oku.endsWith("nya"));  //true
        System.out.println("oku.endsWith(Dunya) = " + oku.endsWith("Dunya"));  //true
        System.out.println("oku.endsWith(YA) = " + oku.endsWith("YA"));   //false
        System.out.println("oku.endsWith(ya) = " + oku.endsWith("ya"));  //true

    }
}
