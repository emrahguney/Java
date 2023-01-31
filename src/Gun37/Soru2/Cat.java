package Gun37.Soru2;

public class Cat implements Animal{
    @Override
    public String food() {
        return "Kediler yas ve kuru mama ile beslenir";
    }

    @Override
    public String toString() {
        return food();
    }
}
