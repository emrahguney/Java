package Gun26._01_Ornek_PrivateveConstructorliCozum;

public class Kampus {
    public static void main(String[] args) {

        Ogrenci ogr1=new Ogrenci(323,"emrahguney",new Okul("tepetarla","Unkown",20000));
        System.out.println(ogr1);
        ogr1.oku();
    }
}
