package Gun04;

public class _03_WideningCasting_GENISLETME {
    public static void main(String[] args) {
        //byte->short->int->long->float->double

        int sayi=9;
        long toplam=6700;  //long degeri int max degerini asmadigi icin sonuna L koymamiza gerek olmadi
        double oran=3.2;

        oran=sayi; //oran=9 oldu, kayip yok
        System.out.println("oran = " + oran);

        toplam=sayi; //kayip yok, toplam=9 oldu

        System.out.println("toplam = " + toplam);

        oran=toplam;   //kayip yok, oran=9

        System.out.println("oran = " + oran);

    }
}
