package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        //Kisinin agirligini double, boyunu int olarak degerler veriniz.
        //ve bir satirda boyunuz... ve kilonuz... seklinde yazdiriniz
        //vucuk kitle indexinide bularak yazdiriniz(kg/boy*boy)

        String tamAd="EMRAH GUNEY";

        double agirlik=73;
        int boy=144;
        double vucutindexi= agirlik/(boy*boy);

        System.out.println("vucutindexi = " + vucutindexi);
        System.out.println("Ad ve Soyadiniz="+tamAd+", kilonuz= "+ agirlik+", boyunuz= " +boy+", vucut indexiniz= " +vucutindexi);


    }
}
