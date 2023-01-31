package Gun29.PrivateErisim;

public class Sirket {
    public static void main(String[] args) {

        Calisan cal1=new Calisan();
        cal1.id=1;
        cal1.name="EMRAH";
        cal1.surname="GUNEY";
        //call1.password="1234";
        //artik private kendi paketinden bile cagrilamaz

        cal1.sifreAta("1234");

        cal1.sifreAta("MASO123_12255l");
        cal1.sifreGoster();


    }
}
