package Gun17;

public class _01_JavaArray_HocaninCozumu {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 0 atayınız  yazdırınız.

        int[] dizi=new int[10];

        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]=(int) (Math.random()*10);
        }

        //dizi once
        for (int i = 0; i < dizi.length ; i++) {

            System.out.println("dizi once = " +dizi[i]);

        }

        for (int i = 0; i < dizi.length ; i++) {

            if (dizi[i]%2==0 )  //ciftse
                dizi[i]=0;

            else    //tekse
            dizi[i]=1;
        }

        //dizi sonra

        for (int i = 0; i < dizi.length ; i++) {
            System.out.println("dizi sonra = " + dizi[i]);

        }




    }
}//2 for dongusu
