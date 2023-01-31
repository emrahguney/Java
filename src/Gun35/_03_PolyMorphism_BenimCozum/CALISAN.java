package Gun35._03_PolyMorphism_BenimCozum;

public class CALISAN extends KISI {

    private String departmani;

    public CALISAN(String ad, String soyad, String gorevi) {
        super(ad, soyad, gorevi);
    }

    public CALISAN(String ad, String soyad, String gorevi, String departmani) {
        super(ad, soyad, gorevi);
        setDepartmani(departmani);
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }

    @Override
    public String toString() {
        return "CALISAN{" +
                "departmani='" + departmani + '\'' +
                "} " + super.toString();
    }
}
