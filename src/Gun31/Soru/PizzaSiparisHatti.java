package Gun31.Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    public static void main(String[] args) {
// Bir pizza sipariş hattı yapılmak isteniyor.
        // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
        // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
        // bir ARRAYLIST e atınız.
        // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
        // verdiğini bir metodda yazdırınız.
        //TODO: HER PIZZA ICIN FIYATLARINIDA EKLE
Scanner oku=new Scanner(System.in);
        ArrayList<PizzaSize> siparisler=new ArrayList<>();
int secim=0;
int smalladet=0;
int mediumadet=0;
int largeadet=0;
      do {
          //menu
          menu();
          //scanner la secimi alalim
          secim= oku.nextInt();
int toplam=0;
          switch(secim){
              case 1: System.out.println("Small pizza ="+PizzaSize.SMALL.fiyat+"TL ve uzunlugu"+PizzaSize.SMALL.size+" cm dir");siparisler.add(PizzaSize.SMALL);smalladet++;break;
              case 2: System.out.println("Medium pizza="+PizzaSize.MEDIUM.fiyat+"TL ve uzunlugu"+PizzaSize.MEDIUM.size+" cm dir");siparisler.add(PizzaSize.MEDIUM);mediumadet++;break;
              case 3: System.out.println("Large pizza="+PizzaSize.LARGE.fiyat+"TL ve uzunlugu"+PizzaSize.LARGE.size+" cm dir");siparisler.add(PizzaSize.LARGE);largeadet++;break;

              case 4:if (siparisler.size()==0) {System.out.println("Siparisiniz yoktur");}
                    else {
                  for (PizzaSize PIZZA : siparisler) System.out.println(PIZZA.fiyat);
                  System.out.println("secimleriniz=");
                  toplam(siparisler);
              }break;



          }


          //eger 4 u secerse arraylist i bir metoda gonder
          //orada hangi pizzadan kac siparis verdigini goster


      }while(secim<=4);


    }

    public static void menu(){

        System.out.println("PizzaMenu ");
        System.out.println("1-Small");
        System.out.println("2-Medium");
        System.out.println("3-Large");
        System.out.println("4-Isleme Al-Siparis Goster");
        System.out.println("5-Cikis" );
        System.out.print("Seciminiz=");
    }

    public static void toplam(ArrayList<PizzaSize> pizza){
int stoplam=0;
int mtoplam=0;
int ltoplam=0;
int fiyat=0;
        for (PizzaSize qwe:pizza){

            System.out.println("Siparisleriniz=");
            System.out.println("toplam siparisiniz = "+stoplam );if (stoplam==0)continue;
            System.out.println("toplam siparisiniz = "+mtoplam );if (mtoplam==0)continue;
            System.out.println("toplam siparisiniz = "+ltoplam );if (ltoplam==0)continue;
        }
    }
}
