package Gun18;

public class _02_Java2DArrays {
    public static void main(String[] args) {

        int[] dizi=new int[10]; //bos default 0 olan
        int[] dizi2={2,3,4,5,6,7,56,67,77};

        int[][] tablo=new int[2][3];    //2 satir row, 3 sutun column,
                                        //bos default deger 0 2*3 kadar 6 adet sayi

        int[][] tablo2={
         //2 satir 3 sutun
                {2,3,4},    //0. satir
                {34,45,5}   //1.satir
        };

    // iki forlu yontem
        for (int satir = 0; satir < 2 ; satir++) {

            for (int sutun = 0; sutun < 3 ; sutun++) {
                System.out.print(tablo2[satir][sutun]+" ");     //yan yana olanlar sutun alt alta olanlar satir

            }
            System.out.println();//bitince alta gecmesi lazim
            // 0 1     0 2     0 3
            // 1 1     1 2     1 3     gidisati boyle olur
        }

        //tek forlu yontem(uzun ve yorucu)
       /* for (int satir = 0; satir <2 ; i++) {

            System.out.print(tablo2[satir][0]+" ");
            System.out.print(tablo2[satir][1]+" ");
            System.out.print(tablo2[satir][2]+" ");
            System.out.println();   */

        }



    }
