package Gun31.PIZZASORUCOZUMU.BenimCozum;


import java.util.ArrayList;
import java.util.Scanner;

public class orn {

    public static void main(String[] args) {
// Bir pizza sipariş hattı yapılmak isteniyor.
        // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
        // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
        // bir ARRAYLIST e atınız.
        // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
        // verdiğini bir metodda yazdırınız.
        // Her pizza tipi için ücret belirleyerek toplam ücreti yazdırınız.
Scanner scan=new Scanner(System.in);
        int secim;
        ArrayList<Pizza> siparisler=new ArrayList<>();
        int toplamfiyat=0;
        int s = 0,m=0,l=0;
        do {
            System.out.print("1-Small,2-Medium,3-Large,4-Goster,5-Cikis=");
            secim= scan.nextInt();

            switch (secim){
                case 1: siparisler.add(Pizza.SMALL);    toplamfiyat+= Pizza.SMALL.fiyat;     System.out.println("Small Boy eklenmistir");s++;break;
                case 2: siparisler.add(Pizza.MEDIUM);    toplamfiyat+= Pizza.MEDIUM.fiyat;     System.out.println("Medium Boy eklenmistir");m++;break;
                case 3: siparisler.add(Pizza.LARGE);    toplamfiyat+= Pizza.LARGE.fiyat;     System.out.println("Large Boy eklenmistir");l++;break;
                case 4:
                  /*  System.out.println("Toplam siparisleriniz");
                    System.out.println("Small Boy="+s);
                    System.out.println("Medium Boy="+m);
                    System.out.println("Large Boy="+l);
                    System.out.println("Toplam ucret="+toplamfiyat);*/
                    secimler(s,m,l,toplamfiyat);break;

                case 5: System.out.println("Iyi gunler dileriz");break;
            }


        }while(secim<5);


}

public static int secimler(int s,int m,int l,int toplam){


    System.out.println("Toplam siparisleriniz");
    System.out.println("Small Boy="+s);
    System.out.println("Medium Boy="+m);
    System.out.println("Large Boy="+l);
    System.out.println("Toplam ucret="+toplam);
    return s;

}
}
