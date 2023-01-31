package Gun12;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("Ders ve notunu giriniz=");
        String DersVeNot= oku.nextLine();
        int index=DersVeNot.indexOf(":");
        int OgrNot=Integer.parseInt(DersVeNot.substring(index+1));
        //int OgrNot2=Integer.parseInt(DersVeNot.replaceAll("[^0-9]","");   //-->0-9 disindakileri sil

        if (OgrNot>=90)
            System.out.println("A");
        else
            if (OgrNot>=80)
                System.out.println("B");
            else
            if (OgrNot>=70)
                System.out.println("C");
            else
            if (OgrNot>=60)
                System.out.println("D");
            else
            if (OgrNot>=40)
                System.out.println("E");
            else
                System.out.println("F" );




    }
}
