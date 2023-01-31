package Gun31.Soru;

public enum PizzaSize {

SMALL(20,30)
        ,MEDIUM(30,45)
        ,LARGE(40,60),
        ;

final int fiyat;
final int size;

        PizzaSize(int fiyat, int size) {
                this.fiyat = fiyat;
                this.size = size;
        }
}//TODO 28 ARALIK DERSINDE KALDIN
