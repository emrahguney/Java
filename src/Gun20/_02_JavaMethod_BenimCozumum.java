package Gun20;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class _02_JavaMethod_BenimCozumum {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("1.sayi gir");
        int x= oku.nextInt();
        System.out.println("2.sayi gir");
        int y= oku.nextInt();

        int enb=enb(x,y);
        System.out.println("enb = " + enb);

    }
    public static int enb(int a,int b){


        if (a>b)
         return a;

        else  return b;






        /** BIRDEN FAZLA DEGERI RETURNLEMEK ISTIYORSAK RETURNA BIR TANESINI YAZMAK YETERLIDIR
         INT DEGERLER HARIC*/
    }
}
