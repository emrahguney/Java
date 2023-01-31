package Gun04;

public class _00_TEKRAR {
    public static void main(String[] args) {

        String bagis1="1000";
        String bagis2="2000";

        int Bagis1=Integer.parseInt(bagis1);
        int Bagis2=Integer.parseInt(bagis2);

        int toplamBagis=Bagis1+Bagis2;

        System.out.println("toplamBagis = " + toplamBagis);

        String bagislar=Integer.toString(toplamBagis);
        System.out.println("bagislar = " + bagislar);

    }
}
