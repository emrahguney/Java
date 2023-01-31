package Gun37.Soru1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Tesla tes1=new Tesla("tesla",2000);
        ToyotaPrius toy1=new ToyotaPrius("Prius",2200);
        Bus bus1=new Bus("Volvo",3000);

        ArrayList<Vehicle> cars=new ArrayList<>(Arrays.asList(tes1,toy1,bus1));

        for (Vehicle arac:cars){
          //  System.out.println(arac.getModel()+"/"+arac+"/"+arac.getEngine());
            System.out.println("-------------------------------------------------");
            System.out.println(arac.getClass().getSimpleName());//class in adini yazdirdik
            System.out.println("------------------------------------------------");
            System.out.println("Model="+arac.getModel());
            System.out.println("Engine="+arac.getEngine());
            if (arac instanceof Tesla){
                System.out.println(((Tesla) arac).drive());
                System.out.println(((Tesla) arac).changeBattery());
            }

            else if (arac instanceof ToyotaPrius) {
                System.out.println(((ToyotaPrius) arac).drive());
                System.out.println(((ToyotaPrius) arac).changeBattery());
                System.out.println(((ToyotaPrius) arac).changeOil());

            }
            else if (arac instanceof Bus){

                System.out.println(((Bus)arac).drive());
                System.out.println(((Bus)arac).changeDiesel());
            }

        }

    }/*  if (cars.get(1) instanceof Toyota){
            System.out.println(((Toyota) cars.get(1)).drive());//FOREACHSIZ BOYLE YAPILIR.
        }*/
}
