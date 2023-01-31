package Gun28._03_Constructor;

public class Bankalar {
    public static void main(String[] args) {
// Bir banka class ı tanımlayınız.
        // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
        // 3 adet constructor ekleyin.
        // toString metodu oluşturun.
        // 3 tane nesne oluşturup mainde yazdırınız


        Banka banka1=new Banka();
        banka1.adi="Ziraat";
        banka1.subesayisi=1000;
        banka1.kurulusyili=1920;

        Banka b2=new Banka("Garanti");
        Banka b3=new Banka(222);
        Banka b4=new Banka("asd",22,33);

        Banka b5=new Banka();

        System.out.println("banka1 = " + banka1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);
        System.out.println("b5 = " + b5);

    }
}
