package Gun35._03_PolyMorphism_HocaninCozumu;

public class Calisan extends Kisi{
   private String Departmani;

    public Calisan(String ad, String soyad, String gorevi,String Departmani) {

        super(ad, soyad, gorevi);
        setDepartmani(Departmani);
    }

    public String getDepartmani() {
        return Departmani;
    }

    public void setDepartmani(String departmani) {
        Departmani = departmani;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "Departmani='" + Departmani + '\'' +
                "" + super.toString();
    }
}
