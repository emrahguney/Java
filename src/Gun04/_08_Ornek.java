package Gun04;

public class _08_Ornek {
    public static void main(String[] args) {
        //String olarak verilen 2 adet bagis parasinin toplamini yazdiriniz

        String bagis1="2000";
        String bagis2="3200";

        int sayiDeger1=Integer.parseInt(bagis1);
        int sayiDeger2=Integer.parseInt(bagis2);

        int toplam=sayiDeger1+sayiDeger2;

        System.out.println("toplam = " + toplam);

        String strtoplam=Integer.toString(toplam);
        System.out.println("strtoplam = " + strtoplam);

    }
}
