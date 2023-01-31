package Gun20;

import java.util.Scanner;

public class _03_JavaMethod_DigerCozumYolu {
    public static void main(String[] args) {
        //kullanicinin girecegi bir sayiya kadar olan sayilarin carpimini (faktoriyel)
        Scanner scan=new Scanner(System.in);
        System.out.print("sayi gir=");

        int sayi= scan.nextInt();

       // toplam(sayi);

        if (toplam(sayi)%2==1){//void tipli olsaydi gecersiz olurdu
            System.out.println("tek");
        }else System.out.println("cift");


}
public static int toplam(int q){

        int toplam=1;
    for (int i = 1; i <=q ; i++) {
        toplam*=i;
    }
    System.out.println("toplam="+toplam);

    return q;
}




}
