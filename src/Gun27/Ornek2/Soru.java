package Gun27.Ornek2;

public class Soru {
    // Math sınıfndaki metodlarıdan 5 tanesini
    // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
    // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
    // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
    // kullanımlarını yazınız.
    public static void main(String[] args) {
        double sayi1=21.44;
        int sayi2=44;

      // Mathmetod.round(sayi1);
        double max=Mathmetod.maksimum(sayi1,sayi2);
        double min=Mathmetod.minimum(sayi1,sayi2);
        double rnd=Mathmetod.round(sayi1);
        int random=Mathmetod.getRandom(sayi2);
        double karekok=Mathmetod.getKareKok(sayi2);

        double usSonuc=Mathmetod.getUsAl(sayi1,sayi2);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("rnd = " + rnd);
        System.out.println("random = " + random);
        System.out.println("karekok = " + karekok);
        System.out.println("usSonuc = " + usSonuc);





    }
}
