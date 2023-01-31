package Gun35._03_PolyMorphism_BenimCozum;

public class KISI {
    private String ad;
    private String soyad;
    private String gorevi;

    public KISI(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "KISI{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }

    public static void kimlik(KISI k){

        if (k instanceof OGRENCI){
            System.out.println("OGRENCI BILGILERI");
            System.out.println(k.getAd());
            System.out.println(k.getSoyad());
            System.out.println(k.getGorevi());
            System.out.println(((OGRENCI) k).getSubesi());
        }
        else if (k instanceof CALISAN){

            System.out.println("CALISAN BILGILERI");
            System.out.println(k.getAd());
            System.out.println(k.getSoyad());
            System.out.println(k.getGorevi());
            System.out.println(((CALISAN) k).getDepartmani());
        }

    }
}
