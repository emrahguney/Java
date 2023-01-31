package Gun26._04_Ornek;

import java.util.ArrayList;

public class ElektrikHesabi {

    int toplamTuketim=0;
    double birimFiyat=0.7;
    double fatura=0;
ArrayList<Integer> aylik=new ArrayList<>();
    public void tuketimEkle(int aylikTuketim){

        toplamTuketim+=aylikTuketim;
        aylik.add(aylikTuketim);
    }
    public void toplamTuketimYaz(){

        System.out.println("toplamTuketim="+toplamTuketim);
    }

    public void faturaYaz(String isim){

        fatura=toplamTuketim*birimFiyat;
        System.out.println("***********************");
        System.out.println("    FATURANIZ");
        System.out.println("MUSTERI="+isim);
        System.out.println("TOPLAM TUKETIM="+toplamTuketim);
        System.out.println("TOPLAM TUTAR="+Math.round(fatura));
        System.out.println("***********************");
    }

    public void aylikTuketim(){
        System.out.println(aylik);
    }

}
