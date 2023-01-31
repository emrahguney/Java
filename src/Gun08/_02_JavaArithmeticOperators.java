package Gun08;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac=0;
        //sayac=sayac+1;    sayac++;    ++sayac; ---->3 ude ayni anlami veriyor
        sayac=sayac+1;      //sayacin degerini 1 tane artiriyor:1
        sayac++;             //sayacin degerini 1 tane artiriyor:2
        ++sayac;             //sayacin degerini 1 tane artiriyor:3

        //sayac=sayac-1;    sayac--;    --sayac;  ---->3 ude ayni anlami veriyor
        sayac=sayac-1;           //sayacin degerini 1 tane azaltir:2
        sayac--;            //sayacin degerini 1 tane azaltir:1
        --sayac;              //sayacin degerini 1 tane azaltir:0

        System.out.println("sayac = " + sayac);
        /* ***********************************************/

        int toplam=5+sayac;     //5 olur
        System.out.println("toplam = " + toplam);//5
        System.out.println("sayac = " + sayac);//0

        toplam=5+sayac++;     //toplam=5+sayac sayaci sonra arttir. sayac=sayac+1
        //toplam=5 ve sayac=1 oldu
        System.out.println("toplam = " + toplam);//5
        System.out.println("sayac = " + sayac);//1


        toplam=5+ ++sayac;  //sayac=sayac+1 sonra toplam=5+sayac 7 olur//sayaci once arttir sonra topla
        System.out.println("toplam = " + toplam);//7
        System.out.println("sayac = " + sayac);//2

        //ozet= ++ lar sagda ise pnce islem sonra artis
        //      ++ lar solda ise once artis sonra islem

        //en cok kullanilicak->sayac++;sayac--
    }
}
