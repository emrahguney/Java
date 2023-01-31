package Gun37.Soru2;

import java.util.ArrayList;
import java.util.Arrays;

public class Hayvanlar {
    public static void main(String[] args) {
//Ekteki Tasarıma göre gerekli modülleri yazınız.
//Sonra her birinden nesne üretiniz.
//metodların hepsinin tipi String
//- ürettiğiniz nesneleri bir ArrayListe ekletip, daha sonra bu ArrayList i
//bir döngü ile metodlarını ekrana yazdırınız.


        Swallow swallow=new Swallow();
        Shark shark=new Shark();
        Duck duck=new Duck();
        Cat cat=new Cat();

        ArrayList<Animal> hayvan=new ArrayList<>(Arrays.asList(swallow,shark,duck,cat));
        for (Animal H:hayvan){
            System.out.println("-------------------------------------------------");
            System.out.println(H.getClass().getSimpleName());//class in adini yazdirdik
            System.out.println("------------------------------------------------");

            if (H instanceof Swallow){

                System.out.println(H.food());
                System.out.println(((Swallow) H).flying());}

            else if (H instanceof Shark) {
                System.out.println( H.food());
                System.out.println(((Shark) H).sailing());

            } else if (H instanceof Duck) {
                System.out.println(H.food());
                System.out.println(((Duck) H).flying());
                System.out.println(((Duck) H).sailing());

            }
            else
                System.out.println(H.food());

        }


    }
}
