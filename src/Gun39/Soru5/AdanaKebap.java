package Gun39.Soru5;

public class AdanaKebap implements Food{
    @Override
    public void taste() {
        System.out.println("Etin en guzel hallerinden biridir");
    }

    @Override
    public double ucret() {
        return 75;
    }

    void marine(){
        System.out.println("Et dunden ozel baharatlarla terbiye edildi");
    }
    void grill(){

        System.out.println("Odun atesinde yavas yavas pisirildi");
    }
}
