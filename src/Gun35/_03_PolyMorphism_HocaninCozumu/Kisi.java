package Gun35._03_PolyMorphism_HocaninCozumu;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }

    @Override
    public String toString() {
        return "" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
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

    public static void yazdir(Ogrenci ogr,Calisan cal){
        System.out.println(ogr);
        System.out.println(cal);
    }
    public static void kimlikYaz(Kisi gelenkisi){
        System.out.println("ad="+gelenkisi.getAd());
        System.out.println("soyad="+gelenkisi.getSoyad());
        System.out.println("gorevi="+gelenkisi.getGorevi());

        //subeside ogrenciyse
        //departmani calisansa

        if (gelenkisi instanceof Ogrenci)   //gelenkisi ogrenci ise veya gelenkisinin ornegi, durumu Ogrenci ise
            System.out.println("Subesi="+((Ogrenci)gelenkisi).getSubesi());
        else if (gelenkisi instanceof Calisan)  //gelenkisi calisan ise veya gelenkisinin ornegi, durumu Calisan ise
            System.out.println("Departmani="+((Calisan)gelenkisi).getDepartmani());
    }

}
