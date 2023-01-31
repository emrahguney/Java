package Gun13;



public class _05_WhileLoop {
    public static void main(String[] args) {
        //100 e kadar olan sayilarin toplamini bulunuz
        int toplam=0;
        int i=1;
        while(i<=100) {
            toplam = toplam + i;
            i++;                //boyle dongulerde genellikle sayaca "i" derler. "i=sayac"
        }


            System.out.println("TOPLAM ="+toplam);



    }
}