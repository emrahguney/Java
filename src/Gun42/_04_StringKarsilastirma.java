package Gun42;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {
        //Stringlerde neden == yerine equal kullaniliyor
        String cumle1="Bugun hava cok guzel";
        String cumle2="Bugun hava cok guzel";


        //ILKEL tipleri karsilastirdigindan 2 sindede DEGERINI KARSILASTIRIR CUNKU baska  bir seyi yok
        if (cumle1==cumle2){
            System.out.println("cumle 1 cumle 2 ye esittir");
        }
        else System.out.println("cumle 1 cumle 2 ye esit degil");

        if (cumle1.equals(cumle2)){
            System.out.println("cumle 1 cumle 2 ye esittir");
        }
        else System.out.println("cumle 1 cumle 2 ye esit degil");
        /***********************************************************************/

        /*REFERANS TIPLERDE ISE DURUM*/
        //scanner le ekrandan okudugunda asagidaki gibi oluyor
        String cumle3=new String("Bugun hava cok guzel");
        String cumle4=new String("Bugun hava cok guzel");
        //image deki soldaki isim ve name gibi ikiside farkli yerleri gosteriyor

        if (cumle3==cumle4){//adresleri karsilastirir
            System.out.println("cumle 3 cumle 4 ye esittir");
        }
        else System.out.println("cumle 3 cumle 4 ye esit degil");

        if (cumle3.equals(cumle4)){
            System.out.println("cumle 3 cumle 4 ye esittir");
        }
        else System.out.println("cumle 3 cumle 4 ye esit degil");

    }
}
