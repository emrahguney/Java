package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo= {//5 satir:0,1,2,3,4

                {4, 55},
                {45, 6, 77},
                {4, 2, 999, 45, 56, 66},
                {42, 12, 9},
                {4},
        };

        System.out.println("SATIR MIKTARI="+tablo.length );
        System.out.println("0.SATIRDAKI SUTUN SAYISI = "+tablo[0].length );
        System.out.println("1.SATIRDAKI SUTUN SAYISI = "+tablo[1].length );
        System.out.println("2.SATIRDAKI SUTUN SAYISI = "+tablo[2].length );
        System.out.println("3.SATIRDAKI SUTUN SAYISI = "+tablo[3].length );
        System.out.println("4.SATIRDAKI SUTUN SAYISI = "+tablo[4].length );

        //yazdirma bolumu
        for (int i = 0; i < tablo.length ; i++) {
            for (int j = 0; j < tablo[i].length ; j++) {
                System.out.print(tablo[i][j]+"\t");

            }
            System.out.println();

        }


    }
}
