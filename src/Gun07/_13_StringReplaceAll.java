package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi çalışır. farkı Kriter(regex) verilebiliyor
        // regex : regular expression / düzenli ifadeler

        //TODO(yapilacak)=odev=regex olarak neler yazilabiliyor google dan arastirilacak
        String text="Merhaba Dunya123";

        System.out.println("text.replaceAll(\"[abn]\",\"_\") = " + text.replaceAll("[abn]","_"));//a,b ve n harflerini "_(alt cizgi)"ye cevirir

        System.out.println("A dan Z ye kadar _ cevir = " + text.replaceAll("[A-Z]","_"));//_erhaba _unya123
        System.out.println("text.replaceAll(\"[0-9]\",\".\") = " + text.replaceAll("[0-9]","."));//Merhaba Dunya...
        System.out.println("text.replaceAll(\"[0-9]\",\"\") = " + text.replaceAll("[0-9]",""));//Merhaba Dunya ->rakamlari sildi


    }
}
