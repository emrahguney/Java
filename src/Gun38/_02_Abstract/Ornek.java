package Gun38._02_Abstract;

public class Ornek {
    /*1- içinde name field ı olan Sekil isimli bir Abstract Class yazınız.
    2- Bu classın Alan ve cevre abstract metodları ve içind eAlan ve cevre nin sonucu olan toString somut metodu,
   sekilin adını veren getName somut metodu ve ciz isimli somut metodlarını ekleyiniz.
    3- Bu sınıftan Dikdörtgen ve Daire isimli 2 class oluşturunuz.
    4- Bunlardan birer örnek main metodunda çalıştırınız.

*/
    public static void main(String[] args) {

        Dikdortgen d1=new Dikdortgen(5,7);
        d1.setName("Yeni dikdortgen");
        d1.ciz();
        System.out.println(d1);


        Daire daire=new Daire(4);
        daire.setName("Yeni Daire");
        daire.ciz();
        System.out.println(daire);
    }


}
