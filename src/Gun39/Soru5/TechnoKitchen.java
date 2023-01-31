package Gun39.Soru5;

public class TechnoKitchen {

    public static void hazirla(Food f){
        System.out.println(f.getClass().getSimpleName());

        if (f instanceof AdanaKebap) {
            System.out.println("Adana Kebap Siparisi");
            ((AdanaKebap) f).marine();
            ((AdanaKebap) f).grill();
            f.taste();
            System.out.println("===============");
        } else if (f instanceof Lahmacun) {
            System.out.println("Lahmacun Siparisi");
            ((Lahmacun) f).dough();
            ((Lahmacun) f).addMeat();
            ((Lahmacun) f).bake();
            f.taste();
            System.out.println("===============");
        } else if (f instanceof Borsh) {
            System.out.println("Borsh Siparisi");
            ((Borsh) f).boil();
            ((Borsh) f).eatTomorrow();
            f.taste();
            System.out.println("===============");
        } else if (f instanceof Palov) {
            System.out.println("Palov Siparisi");
            ((Palov) f).fry();
            ((Palov) f).boil();
            f.taste();

        }
    }
}
