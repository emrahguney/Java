package Gun14;

public class _03_forLoop {
    public static void main(String[] args) {
        // 0 den 10(dahil) kadar sayıları ekrana yazdırınız.
        // 10 dan 0(dahil) kadar sayıları ekrana yazdırınız.(ayri bir diğer for)
        int i;
        int sayac;

        for ( i = 0; i <= 10; i++) {
            System.out.println("i+ = " + i);
        }

        for ( sayac = 10; sayac >= 0; sayac--) {
            System.out.println("sayac=" + sayac);

        }
    }
}