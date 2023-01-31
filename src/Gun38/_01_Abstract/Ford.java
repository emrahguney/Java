package Gun38._01_Abstract;

public class Ford extends BinekOto {
    public Ford(String marka, int uretimYili, int vitesAdedi) {
        super(marka, uretimYili, vitesAdedi);
    }

    @Override
    int hizlanmasuresi() {
        return 2;
    }

    @Override
    int hiz() {
        return 44;
    }

    /*
       getUretimYili() METODU UST SINIFTA TANIMLANMISTIR VE ALT SINIFTA DEGISTIRILEREK TEKRAR RE-IMPLEMENTE EDILEBILIR

        YADA DEGISTIRILMEDEN KULLANILABILIR.
     */

    @Override
    public int getUretimYili() {
        System.out.println(super.getUretimYili());
        return super.getUretimYili();
    }
}
