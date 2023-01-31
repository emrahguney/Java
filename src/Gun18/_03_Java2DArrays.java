package Gun18;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // bütün doldurma işlemi bittikten sonra
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz
        int[][] tablo=new int[2][3];



        for (int i = 0; i < tablo.length ; i++) {
            for (int j = 0; j <tablo[i].length ; j++) {

                tablo[i][j]=(int)(Math.random()*100);
            }


        }


        for (int i = 0; i < tablo.length ; i++) {
            for (int j = 0; j < tablo[i].length ; j++) {
                System.out.print(tablo[i][j]+" ");

            }
            System.out.println();
        }
        int teksayi=0;
        for (int i = 0; i < tablo.length ; i++) {
            for (int j = 0; j < tablo[i].length ; j++) {
                if (tablo[i][j] % 2 == 1)
                {teksayi++;
                    System.out.println("tek sayilar="+tablo[i][j]+" ");}
            }
        }
        System.out.println("teksayi adedi= " + teksayi);
    }
}
