package Gun06;

public class _03_StringCharAt {
    public static void main(String[] args) {
        //istenilen noktadaki karakteri verir
        //karakterlerin sirasi 0 dan baslar ve buna index denir

                    // 0123456798 10 11 12
        String cumle= "Merhaba Dunya"; // length(uzunluk) 13 ama karakterlerin odasi 0-12 dahil

        char ilkHarf=cumle.charAt(0); //0 index deki karakteri ver// anlami sifirdaki karakter soyle diyor
        System.out.println("ilkHarf = " + ilkHarf);


    }
}
