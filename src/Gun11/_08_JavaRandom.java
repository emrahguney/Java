package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {
        //Math.Random() : double sayi uretir. 0- 0,999999999... arasi

        double randSayi=Math.random();
        System.out.println("randSayi = " + randSayi); //// bu farkli


        //0-6 arasi uretsin
        //6 ile carparim
        //0-5,9999999999
        //int cevirirsem 0-5;

        int rndTamSayi=(int)(Math.random()*6);
        System.out.println("rndTamSayi = " + rndTamSayi); ///buda farkli random sayi uretme bagimzsizlar yukardaki random sayi ile karistirma
    }
}
