package Gun39.Soru5;

import Gun39.MyFunc;

import java.util.ArrayList;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
       /* 1.Bölüm
        void taste()
        double ucret()
        bir interface yazınız.

        2.Bölüm de
        Aşağıdaki metodları olan classları yazınız.food dan implemente alarak

        AdanaKebab: void marinade(), grill()
        Lahmacun: dough(), addMeat(), bake()
        Borsh: boil(), eatTomorrow()
        Palov: fry(), boil()

        3.Bölüm
        TechnoCafe isimli class da ki main metodunda kullanıcıya menüyü sunarak
                kullanıcı tamam seçeneğini seçene kadar yemek siparişini alınız.
        ödev:seçim sonrası kaç adet olduğunu da alınız.
                Bu yemekleri bir ArrayList e ekleyeiniz.
                Menü*
                1-Adana Kebap (75 TL)
        2-Lahmacun (33 TL)
        3-Borsh (33 TL)
        4-Palov (44 TL)
        0-Tamam

        4. Verilen siparişleri main de bir döngü vasıtasıyla TechnoKitchen isimli
        classa tek tek göndererek hazırlatınız, ve ücret bilgisini oluşturup.
                yazdırınız.*/

        ArrayList<Food> siparisler=new ArrayList<>();
        Scanner oku=new Scanner(System.in);

        int secim=0;
        do {
            menu();

            secim= oku.nextInt();
            switch (secim){
                case 1:Food ak=new AdanaKebap();siparisler.add(ak);break;//AdanaKebap ak=new AdanaKebap(); dersende olur ayni seydir
                case 2:Food lh=new Lahmacun();siparisler.add(lh);break;
                case 3:Food bo=new Borsh();siparisler.add(bo);break;
                case 4:Food pl=new Palov();siparisler.add(pl);break;

            }


        }while(secim<5);
        System.out.println("Siparisleriniz");

        for (Food F:siparisler){System.out.println(F.getClass().getSimpleName());}

        System.out.println("Siparisleriniz hazirlaniyor...");

        /***/
        MyFunc.bekle(3);
        /***/

        double toplam=0;
        for (Food F:siparisler){
            TechnoKitchen.hazirla(F);
            toplam+=F.ucret();
        }
        System.out.println("ucretiniz="+toplam);




    }

    public static void menu(){
        System.out.println("---Menu---\n 1-Adana Kebap (75 TL)\n 2-Lahmacun (20 TL)\n 3-Borsh (40 TL) \n 4-Palov (20 TL))\n 5-Tamam "+"\nSeciminiz=");    }
}