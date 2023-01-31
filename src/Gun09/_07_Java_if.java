package Gun09;

import java.util.Scanner;

public class _07_Java_if {
    public static void main(String[] args) {
        //Girilen bir cumledeki kucuk veya buyuk a harfinin olup olmadigini yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.print("CUMLE GIR = ");
        String cumle= oku.nextLine().toLowerCase();

        if (cumle.contains("a"))
            System.out.println("VAR");
        if (!cumle.contains("a"))
            System.out.println("YOK");



    }
}
