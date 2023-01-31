package Gun12;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {
        //Kullanicinin girdigi gun numarasina karsilik gelen gunu adini yaziniz

        Scanner oku = new Scanner(System.in);
        System.out.print("Gun no=");
        int gunNo = oku.nextInt();

        //if (gunNo==1)
        //  System.out.println("PAZARTESI");
        // else
        //       if (gunNo==2)
        //            System.out.println("SALI" );
        //      ..........
        //    ...........

        switch (gunNo) {
            case 1: System.out.println("PAZARTESI"); break;         //islemi kesceksek yanina break; yazariz

            case 2: System.out.println("SALI"); break;              // break i koymazsan mesela 4 numara girersen 4 un asagisina kadar ne varsa yazar ama
                                                                    //4 un yanina break koyarsan 4 yazarsan sadece 4 u alir ve islemden cikar
            case 3: System.out.println("CARSAMBA");break;

            case 4: System.out.println("PERSEMBE");break;

            case 5: System.out.println("CUMA");break;

            case 6: System.out.println("CUMARTESI");break;

            case 7: System.out.println("PAZAR");break;

            default:                                            //default da-> caselerin disinda bir rakam girilirse ne yazacagini yaziyorsun
                System.out.println("HATALI NUMARA " );

                //iflerde tek deger olmasi durumunda 2 den fazla if kullanman gerekiyorsa SWITCH diger durumlarda if

        }

    }
}