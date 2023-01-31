package Gun13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        //girilen bir ay numarasina gore ayin kac gun surdugunu yazdiriniz
        Scanner intoku = new Scanner(System.in);

        System.out.print("AY GIRINIZ=");
        int ay = intoku.nextInt();

        switch (ay) {
            case 1:
                System.out.println("1.AY =31 ");
                break;
            case 2:
                System.out.println("2.AY = 28");
                break;
            case 3:
                System.out.println("3.AY = 31");
                break;
            case 4:
                System.out.println("4.AY =30 ");
                break;
            case 5:
                System.out.println("5.AY =31 ");
                break;
            case 6:
                System.out.println("6.AY =30 ");
                break;
            case 7:
                System.out.println("7.AY =31 ");
                break;
            case 8:
                System.out.println("8.AY =31 ");
                break;
            case 9:
                System.out.println("9.AY =30 ");
                break;
            case 10:
                System.out.println("10.AY =31 ");
                break;
            case 11:
                System.out.println("11.AY =30 ");
                break;
            case 12:
                System.out.println("12.AY =31 ");
                break;
            default:
                System.out.println("HATA");
                break;
        }

        //2.YONTEM
        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);             //SAYIDA "" ISARETI KOYUP ICINE YAZMAYA GEREK YOK SOUT UN ICINE DIREK RAKAMI YAZABILIYORSUN AMA STRING DE "" ICINE YAZMAN LAZIM
                break;

            case 2:
                System.out.println(28);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            default:
                System.out.println("HATALI AY");

        }


    }

}