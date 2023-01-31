package Gun05;

import java.util.Scanner;

public class _03_Ornek2_Tekrar {
    public static void main(String[] args) {
        //Kullanicidan adini ve soyadini alarak ekrana yazdiriniz

        Scanner oku=new Scanner(System.in);     //okuma islemini yapacak olan degisken tanimlandi

        System.out.print("Adiniz=");//ekrana neyin girilecegini yazdik bilgilendirme

        String ad=oku.nextLine();//okuma islemi bu noktada yapiliyor

        System.out.print("Soyadiniz=");//ekrana neyin girilecegini yazdik bilgilendirme

        String soyad=oku.next();//okuma islemi bu noktada yapiliyor

        System.out.println("AD = " + ad);//verinin gercekten okunabildigini tekrar ekrana yazarak kontrol ettim
        System.out.println("SOYAD="+soyad);//verinin gercekten okunabildigini tekrar ekrana yazarak kontrol ettim
        System.out.println("AD ve SOYAD="+ad+" "+soyad);//verinin gercekten okunabildigini tekrar ekrana yazarak kontrol ettim




    }
}
