package Gun35._03_PolyMorphism_BenimCozum;

public class MAIN {
    public static void main(String[] args) {
        OGRENCI ogr=new OGRENCI("emrah","guney","ogrenci",12);
        CALISAN cal=new CALISAN("ali","duvan","mudur","bilisim");


        KISI.kimlik(ogr);
        System.out.println("**************************");
        KISI.kimlik(cal);
    }
}
