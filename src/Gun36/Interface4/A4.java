package Gun36.Interface4;
// bir class birden fazla Interface implemente edebilir

public class A4 implements IGosterir,IYazdirir {
    @Override
    public void goster() {
        System.out.println("gosterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("yazdirdi");
    }
}
