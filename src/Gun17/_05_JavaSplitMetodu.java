package Gun17;


import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        //Split=bir Stringi parcalara ayirmak demek

        //Kullanicidan alacaginiz cumleyi kelimelerine gore alt alta yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.print("Cumle Gir = " );
        String cumle= oku.nextLine();

      String[] kelimeler=  cumle.split(" ");
int kelime=0;
        for (int i = 0; i < kelimeler.length ; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);

            kelime++;
        }
        System.out.println("kelime sayisi="+kelime);



    }
}
