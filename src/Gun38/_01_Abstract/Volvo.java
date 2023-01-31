package Gun38._01_Abstract;

public class Volvo extends BinekOto{
    public Volvo(String marka, int uretimYili, int vitesAdedi) {
        super(marka, uretimYili, vitesAdedi);
    }

    @Override
    int hizlanmasuresi() {
        return 0;
    }

    @Override
    int hiz() {
        return 55;
    }
}
