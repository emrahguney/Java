package Gun06;

public class _05_StringIndexOf_Tekrar {
    public static void main(String[] args) {

        String cumle="Merhaba Dunya";

        //D nin index i kactir
        System.out.println("cumle.indexOf(\"D\") = " + cumle.indexOf("D"));//Anlami D harfinin indexi(sirasi) kac oldugunu yazdik

        System.out.println("cumle.indexOf(\"a\",5) = " + cumle.indexOf("a",5));//anlami 5.harfden sonra a harfi ilk hangi sirada oldugunu soruyoruz
                                                                                //a yi aramaya5(dahil) nolu index ten sonra basla

    }
}
