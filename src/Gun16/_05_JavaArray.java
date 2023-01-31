package Gun16;

import java.util.Random;
import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

    String[] kanal=new String[5];
    kanal[0]="trt";
    kanal[1]="kanald";
        kanal[2]="atv";
        kanal[3]="fox";
        kanal[4]="haberturk";

        int randomsayi=(int)(Math.random()*5);
        System.out.println("randomsayi = " + randomsayi);

        System.out.println("kanallar = " +kanal[randomsayi]);





    }
}
