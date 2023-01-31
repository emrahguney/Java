package Gun07;



public class _07_StringStartsWith {
    public static void main(String[] args) {
        //StartsWith:bununla basliyor mu?
        //sonuc true veya false
        
        String text="HCL Teknoloji";

        System.out.println("text.startsWith(\"HC\") = " + text.startsWith("HC"));
        System.out.println("text.startsWith(\"e\") = " + text.startsWith("e"));
        System.out.println("text.startsWith(\"h\") = " + text.startsWith("h"));
        System.out.println("text.startsWith(\"H\") = " + text.startsWith("H"));
    }
}
