package Gun10;


import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
    //girilen vize(%50) ve final(%50) notunu okuyarak ortalamayi bulunuz ortalama 60 dan buyukesit ise gectiniz,tebrikler yazdiriniz
        //degilse butunlemeye kaldiniz seklinde yazdiriniz

        Scanner oku=new Scanner(System.in);


        System.out.print("VIZE= " );
        double vize= oku.nextDouble();

        System.out.print("FINAL= " );
        double Final= oku.nextDouble();

        double not=(vize+Final)/2;
        System.out.println(" NOT= " + not);
        if (not>=60)
            System.out.println("GECTINIZ,TEBRIKLER " );
        else
            System.out.println(" BUTUNLEMEYE KALDINIZ" );

        //Suslu parantez kurali=sadece 1 satir(;) calisacak ise zorunlu degil, birden fazla ise zorunlu.Herzaman koyulabilir, hicbir mahsuru yok

        //VIZE %40 FINAL %60 OLARAK COZUMU
        /* Scanner oku= new Scanner(System.in);

        System.out.print("VIZE NOT GIR = ");
        int vize= oku.nextInt();
        System.out.print("FINAL NOTU GIR = ");
        int Final= oku.nextInt();

        double not=(vize*0.4)+(Final*0.6);

        if ((vize*0.4)+(Final*0.6)>=60)
        System.out.println("GECTIN="+not );
        else
            System.out.println("BUTUNLEMEYE KALDIN="+not);  */



    }
}
