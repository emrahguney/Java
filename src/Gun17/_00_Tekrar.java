package Gun17;


import java.util.Arrays;
import java.util.Scanner;

public class _00_Tekrar {
    public static void main(String[] args) {


    /**  int []sayi=new int[10];

        for (int i = 0; i < sayi.length ; i++) {

            sayi[i]=(int)(Math.random()*11);
            System.out.println("dizi once= " + sayi[i]);
        }
        for (int i = 0; i < sayi.length ; i++) {

            if (sayi[i]%2==0) {
                System.out.println("dizi sonra"+"=0");}
            else System.out.println("dizi sonra"+"=1");

        }**/

  /*  Scanner oku=new Scanner(System.in);

    int kelimesayisi=0;
        System.out.print("CUMLE GIR = " );
    String cumle= oku.nextLine();
    String[] kelime=cumle.split(" ");
        for (int i = 0; i < kelime.length ; i++) {
            System.out.println("kelime = " + kelime[i]);
            kelimesayisi++;
        }
        System.out.println("kelimesayisi = " + kelimesayisi);   */


     /**   Scanner oku=new Scanner(System.in);

        System.out.print("cumle = " );
        String cumle= oku.nextLine();
int bosluk=1;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)==' ')
                bosluk++;
        }
        System.out.println("bosluk = " + bosluk);**/
Scanner oku=new Scanner(System.in);
int []sayi=new int[10];
        System.out.println("sayi gir = " );
        int SAYI= oku.nextInt();

        for (int i = 0; i < sayi.length ; i++) {
            sayi[i]=(int)(Math.random()*11);


            if (sayi[i]==SAYI)
            { System.out.println(i+". indexinde" );}

            System.out.println("yok");

        }
        System.out.println("sayi = " +Arrays.toString(sayi));






        }
    }

