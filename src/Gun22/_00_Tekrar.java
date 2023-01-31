package Gun22;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _00_Tekrar {
    public static void main(String[] args) {

        ArrayList<Integer> matNotlari = new ArrayList<>();
        ArrayList<Integer> fizNotlari = new ArrayList<>();
        ArrayList<Integer> kimNotlari = new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        // ArrayList in ArrayList i ni nasıl yaparım
        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>(); // Listlerin listesi
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);
        // Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 50 70 80
        // Fizik : 30 40
        // Kimya : 60 70 80 90

        ArrayList<String> dersAd=new ArrayList<>();
        dersAd.add("Matematik");
        dersAd.add("Fizik");
        dersAd.add("Kimya");
        for (int i = 0; i < notlarListesi.size() ; i++) {
            System.out.print(dersAd.get(i)+":");
            for (int j = 0; j < notlarListesi.get(i).size() ; j++) {
                System.out.print(notlarListesi.get(i).get(j)+" ");
            }
            System.out.println();
        }

        // Soru 2 :
        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.print("Ders no gir(0-Mat, 1-Fiz, 2-Kim)=");
        int dersNo=scan.nextInt();
        DersNoYaz(dersNo,notlarListesi);
        System.out.println();
        // Soru 3 :
        // Yukarıda verilen derse ait not otlamasını ve geçen sayısını bir metodda yazdırınız.
        DersOrt(dersNo,notlarListesi);

    }

    public static void DersNoYaz(int dno, ArrayList<ArrayList<Integer>> ders){

        for (int i = 0; i <ders.get(dno).size() ; i++) {
            System.out.print(ders.get(dno).get(i)+" ");
        }


    }

   public static void DersOrt(int d,ArrayList<ArrayList<Integer>> ders){

        int toplam=0;
        for (int i = 0; i < ders.get(d).size() ; i++) {
            toplam+=ders.get(d).get(i);
        }
        int ort=toplam/ders.get(d).size();
        System.out.println("ort = " + ort);
    }
}