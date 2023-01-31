package Gun31.PIZZASORUCOZUMU.BenimCozum;

public enum Pizza {
    SMALL(20),
    MEDIUM(30),
    LARGE(40),

    ;
    final int fiyat;

    Pizza(int fiyat) {
        this.fiyat = fiyat;
    }
}