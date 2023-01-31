package Gun31.PIZZASORUCOZUMU;

import java.util.ArrayList;
import java.util.Scanner;

public class PIZZASIPARIS {
    public static void main(String[] args) {
        // Bir pizza sipariş hattı yapılmak isteniyor.
        // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
        // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
        // bir ARRAYLIST e atınız.
        // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
        // verdiğini bir metodda yazdırınız.
        // : Her pizza tipi için ücret belirleyerek toplam ücreti yazdırınız.

        Scanner scan=new Scanner(System.in);
        ArrayList<PizzaBoyu> SIPARIS=new ArrayList<>();
int secim=0;

        do {menu();

            secim=scan.nextInt();
        switch (secim){
            case 1:
                System.out.println("Small Boy eklenmistir");
                SIPARIS.add(PizzaBoyu.SMALL);break;
            case 2:
                System.out.println("Medium Boy eklenmistir");
                SIPARIS.add(PizzaBoyu.MEDIUM);break;
            case 3: System.out.println("Large Boy eklenmistir");
                SIPARIS.add(PizzaBoyu.LARGE);break;
            case 4:siparisler(SIPARIS);


        }


        }while (secim<=4);


    }

    public static void menu(){
        System.out.println("-----PIZZA MENU-----");
        System.out.println("1=SMALL");
        System.out.println("2=MEDIUM");
        System.out.println("3=LARGE");
        System.out.println("4=SIPARISLER");
        System.out.println("5=CIKIS");
        System.out.print("SECIMINIZ=");


    }

    public static void siparisler(ArrayList<PizzaBoyu> SIPARIS){
        int small=0;
        int medium=0;
        int large=0;
        for (PizzaBoyu P:SIPARIS){
            if (P.fiyat==20)small++;
            else if (P.fiyat==30)medium++;
            else if (P.fiyat==40) large++;

        } System.out.println("Siparisleriniz");
        System.out.println("SMALL = "+small);
        System.out.println("MEDIUM = "+medium);
        System.out.println("LARGE = "+large);
        System.out.println("Toplam Fiyat="+ ((small*(PizzaBoyu.SMALL.fiyat))+(medium*(PizzaBoyu.MEDIUM.fiyat))+(large*(PizzaBoyu.LARGE.fiyat))));
    }
}
