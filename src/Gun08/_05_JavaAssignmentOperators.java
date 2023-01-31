package Gun08;

public class _05_JavaAssignmentOperators {
    public static void main(String[] args) {
        int a=10;
        //a=a+5;  //a=15

        a+=5; //yine ayni 15 olur               /*   a+=5 ile a=a+5 in anlamlari aynidir  */
            //a nin artis miktari 5 dir.
        int b=10;
        //b=b-5; //b 5 oldu
        b-=5; //aynisi 5 olur

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c=10;
        //c=c/5;
        c/=5;
        int d=25;   //d=d*10
        d*=10;

        System.out.println("c = " + c);
        System.out.println("d = " + d);


    }
}
