package Gun38._03_Abstract;

public class Soru {
    public static void main(String[] args) {
        Baklava bak=new Baklava();
        bak.setName("baklava");
        System.out.println(bak);

        CheeseCake CC=new CheeseCake();
        CC.setName("cheesecake");
        System.out.println(CC);

        GreekSalad GS=new GreekSalad();
        GS.setName("greek salad");

        System.out.println(GS);

        SezarSalad SZ=new SezarSalad();
        SZ.setName("sezar salad");
        System.out.println(SZ);
    }


}
