package Gun15;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *

        for (int i = 1; i <= 5; i++) {

            for (int j = 0; j < i; j++)

                System.out.print("*");
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >= i; j--)        //PROGRAMIN NASIL CALISTIGINI GORMEK ICIN HANGI KODDA NASIL CALISITIGINA BAKMAK ICIN SOLUNDAKI RAKAMA TIKLA KIRMIZI YUVARLAK ISARETI
                                                //CIKACAK SONRA SAG TIK ILE DEBUG DIYIP F8 E TEK TEK BASIP NASIL CALISTIGINI TEK TEK GOSTERIYOR

                System.out.print("*");
            System.out.println();




        }
    }
}