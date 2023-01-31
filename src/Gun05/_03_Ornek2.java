package Gun05;

import java.util.Scanner;

public class _03_Ornek2 {
    public static void main(String[] args) {
        //Kullanicidan Adini ve soyadini alarak ekrana yazdiriniz

        Scanner oku=new Scanner(System.in);  //okuma islemini yapacak olan degisken tanimlandi

        System.out.print("Adiniz ve Soyadiniz = ");//ekrana neyin girilecegini yazdik bilgilendirme

        String AdveSoyad=oku.nextLine();//okuma islemi bu noktada yapiliyor
        System.out.println("Ad\tve\tSoyad = " + AdveSoyad);//verinin gercekten okunabildigini
        //tekrar ekrana yazarak kontrol ettim


    }
}
