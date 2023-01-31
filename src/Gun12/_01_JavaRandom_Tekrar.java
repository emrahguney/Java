package Gun12;

import java.util.Random;
import java.util.Scanner;

public class _01_JavaRandom_Tekrar {
    public static void main(String[] args) {
       Scanner oku=new Scanner(System.in);
        System.out.println("min= " );
        int min= oku.nextInt();
        System.out.println(" max= " );
        int max= oku.nextInt();

        int random=(int)(Math.random()*(max-min)+min);      //(Math.random()*(max-min)->burada once arasi kadar random sayi uretmesi isteniliyor +min eklenincede siniri belirleniyor
        System.out.println("random = " + random);
    }
}
