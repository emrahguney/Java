package Gun18;

public class _03_Java2DArrays_HocaninCozumu {
    public static void main(String[] args){
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz

        int[][] tablo=new int[2][3]; // ye 3 lük bir tabloyu

        for (int satir = 0; satir < 2; satir++) { //random 100 e kadar sayılarla doldurunuz
            for (int sutun = 0; sutun <3 ; sutun++) {

                tablo[satir][sutun]=(int)(Math.random()*100);

            }

    }
            int tekMiktar=0;
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun <3 ; sutun++) {

                System.out.print(tablo[satir][sutun]+"\t");

                if(tablo[satir][sutun]%2==1)
                    tekMiktar++;

                                                             }

            System.out.println();


                }
        System.out.println("tekMiktar = " + tekMiktar);

/** TEK FORLU
 int sayi[][] = new int[2][3];
 int teksayi=0;
 for (int i = 0; i < sayi.length; i++) {
 for (int j = 0; j < sayi[i].length; j++) {
 sayi[i][j] = (int) (Math.random() * 100);
 System.out.print(sayi[i][j] + " ");
 if (sayi[i][j]%2==1)
 teksayi++;
 }
 System.out.println();
 } System.out.println("teksayi = " + teksayi);
 */








        }
    }