package Gun30.Soru;

public class Ornek {


    int a;
    static int b=0;
    void artir(){
        a++;
        b++;

    }


    public static void main(String[] args) {


        Ornek gs1=new Ornek();

        gs1.a=5;

        Ornek gs2=new Ornek();
        gs2.a=7;

        //a nin degeri kac oldu suanda :: Burada verilecek cevap hangi a yi soruyorsunuz olmali
        //Burada her nesnenin a si var ve gs1 in 5 , gs2 nin ise 7 degeri var

        System.out.println("gs1.a = " + gs1.a);//5
        System.out.println("gs2 = " + gs2.a);//7

        //Soru:b nin degeri kactir : tek bir degeri vardir en son deger

        System.out.println("Ornek.b = " + Ornek.b);

        gs1.artir();
        gs2.artir();
        System.out.println("gs1 = " + gs1.a+" "+gs1.b);
        System.out.println("gs2 = " + gs2.a+" "+gs2.b);


        



    }
}
