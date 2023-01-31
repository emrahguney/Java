package Gun36.Interface;

public interface IMagaza {
    void bilgileriAl(); //public void bilgileriAl(); public yazmana gerek yok yukardaki(public interface IMagaza) public olunca asagidakilerde public olur.buna ozel durum
    void krediSkorunuKontrolEt();
    void krediSecenekleriniGoster();
    void belgeleriImzalat();
    void krediyiKullandir();
    int KrediSkorunuGoster();

   // private void credit(); Burada 'private' değiştiricisine izin verilmez, private yazilamaz

    default void credit() {     //default ile boyle oluyor//Extension method should have a body(Uzatma yönteminin bir gövdesi olmalıdır)
        System.out.println("credit");
    }

    static String kredi() {
        return "eqweewqqrwqrewrfsfdsaferw";
    }

   // protected String kredi2();Burada 'protected' değiştiricisine izin verilmez.private ile benzer

    //final void  kredi2(); //Modifier 'final' not allowed here
}
