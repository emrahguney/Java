package Gun39.Soru4;

class C{//dede
    public C() {
        System.out.println("C");
    }
}
class B extends C{//baba
    public B() {
        System.out.println("B");
    }
}
class A extends B{//evlat
    public A() {
        System.out.println("A");
    }
}


public class MAIN {
    public static void main(String[] args) {
        A a=new A();
      //  System.out.println(a);
    }
}
