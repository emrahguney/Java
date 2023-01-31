package Gun39.Soru2;

public class ABMain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("A.mesaj = " +A.mesaj);//A dan merhaba

        B b=new B();// constructor calisti
        System.out.println("A.mesaj = " + A.mesaj);//B den merhaba

        A a2=new A();//bunu degistirici bir etkisi yok
        System.out.println("A.mesaj = " + A.mesaj);//B den merhaba
    }
}
