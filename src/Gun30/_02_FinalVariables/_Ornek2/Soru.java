package Gun30._02_FinalVariables._Ornek2;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {



        int gun=0;
        int saat=0;
        int dakika=0;

        Scanner oku=new Scanner(System.in);

        System.out.print("Gun=" );
        gun= oku.nextInt();
        System.out.println("Saat");
        saat= oku.nextInt();
        System.out.println("dakika");
        dakika= oku.nextInt();
//1.yontem
        int toplamsaniye=gun
                *Saat.birGundekiSaatSayisi
                *Saat.birSaatdekiDakSayisi
                *Saat.birDakikadakiSanSayisi
                +
                saat
                *Saat.birSaatdekiDakSayisi
                *Saat.birDakikadakiSanSayisi
                +
                dakika
                *Saat.birDakikadakiSanSayisi;

        System.out.println("toplamsaniye = " + toplamsaniye);

        //2.yontem
        System.out.println("Saat.hesapla(gun,saat,dakika) = " + Saat.hesapla(gun,saat,dakika));





    }
}
