package Gun11;

import DERSKISANOTLAR.Gun01_Gun13_Arasi;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a=-12;
        int b=4;

        System.out.println("a nin mutlak degeri= "+Math.abs(a) ); //12  >>>mutlak=absolute
        System.out.println("a ve b den buyuk olani=" +Math.max(a,b)); //4
        System.out.println("a ve b den kucuk olani="+Math.min(a,b)); //-12
        System.out.println("2 nin 3. kuvveti ="+Math.pow(2,3)); //8   >>>kuvvet=power
        System.out.println("b nin karekoku="+Math.sqrt(b)); //2  >>>squareroot=karekok

        System.out.println("round 3.1="+Math.round(3.1)); //yuvarlarsan 3 cikar
        System.out.println("round 3.5="+Math.round(3.5)); //yuvarlarsan 4 cikar. round-> yuvarlama demektir

        System.out.println("ceil 3.1="+Math.ceil(3.1)); //bu rakamdan buyuk en yakin tam sayi->sonuc 4 verir bu ornekte >>>>>> ceil=tavan
        System.out.println("ceil 3.5="+Math.ceil(3.5)); //bu rakamdan buyuk en yakin tam sayi->sonuc 4 verir bu ornekte

        System.out.println("floor 3.1="+Math.floor(3.1));   //bu rakamdan en kucuk en yakin tam sayi->sonuc 3 verir bu ornekte >>>>>floor=zemin
        System.out.println("floor 3.5="+Math.floor(3.5));   //bu rakamdan en kucuk en yakin tam sayi->sonuc 3 verir bu ornekte

       //int enb= Gun20._01_JavaMethod.enbBul(a,b);
       // System.out.println("enb = " + enb);



    }
}
