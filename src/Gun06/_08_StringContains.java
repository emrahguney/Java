package Gun06;

public class _08_StringContains {
    public static void main(String[] args) {
        //contains:bir string icerisinde karakter(lerin) var olup olmadigini boolean cinsinden soyle true veya false

        String cumle="Merhaba Dunya";

        boolean varMi=cumle.contains("r");
        System.out.println("varMi = " + varMi);
        
        //direkt de yapabilirsiniz
        System.out.println("a varmi= " +cumle.contains("a") );
        System.out.println("k varmi="  + cumle.contains("k"));
        System.out.println("ya varmi="   + cumle.contains("ya"));
    }
}
