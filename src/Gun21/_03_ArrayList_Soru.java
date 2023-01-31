package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    public static void main(String[] args) {
// Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.
Scanner okuInt=new Scanner(System.in);
Scanner okuStr=new Scanner(System.in);
     /*   ArrayList<Integer> notlar=new ArrayList<>();

        do{
            //notu girecek
            //notlari arrayliste at
            //girilen notlari topla
            //devam etmek istiyormusunuz(E/H)



        }while (devam=='E');

        //ortalamayi bul
        //gecen sayisini bul    */

        ArrayList<Integer> notlar=new ArrayList<>();
        int toplam=0;
        String devamMi;
        do{
            //notu girecek
            System.out.print("NOT=" );
            int not= okuInt.nextInt();
            //notlari arrayliste at
            notlar.add(not);
            //girilen notlari topla
            toplam=toplam+not;
            //devam etmek istiyormusunuz(E/H)
            System.out.print("devam etmek istiyormusun (E/H)=");
                devamMi=okuStr.next();


        }while (devamMi.equalsIgnoreCase("E"));

        //ortalamayi bul
        int ort=toplam/notlar.size();
        System.out.println("ort = " + ort);
        //gecen sayisini bul
        int gecenSayisi=0;
        for (int i = 0; i < notlar.size() ; i++) {

            if(notlar.get(i)>ort)
                gecenSayisi++;

        }

        System.out.println("gecenSayisi = " + gecenSayisi);


    }
}
