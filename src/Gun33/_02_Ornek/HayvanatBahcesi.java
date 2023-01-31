package Gun33._02_Ornek;

public class HayvanatBahcesi {
    public static void main(String[] args) {
//    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    kopekler için (renk,kilo, cinsi)
//    yılanlar için renk, kilo, cinsi, uzunluk)
//    ordek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konustu metodu vardır.

        Kopekler kopek1=new Kopekler("beyaz",50,"kangal");
        kopek1.konustu();
        System.out.println(kopek1.getCinsi());

        Kedi kedi1=new Kedi("Siyah",5,"Scottish");
        kedi1.konustu();
        System.out.println(kedi1.getKilo());

        Ordek ordek1=new Ordek("Beyaz",6,"govel",65);
        ordek1.konustu();

        Yilan yilan1=new Yilan("Gri",4,"Piton",10);
        yilan1.konustu();
        System.out.println(yilan1.getUzunluk());


    }
}
