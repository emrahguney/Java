package Gun15;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {

        // 2 lerin çarpım tablosunu sormuştuk.
        // 2 x 1 =2
        // 2 x 2 =4
        // ....

        // 5(dahil) lere kadar halini yapınız

        for (int a = 1; a <= 5; a++) {

            for (int i = 1; i <= 10; i++) {
                int carpim = a * i;
                System.out.println(a + "*" + i + "=" + carpim);   //yanyana yazmak icin-> System.out.print(a + "*" + i + "=" + carpim+" ");
            }

                System.out.println();

        }
    }
}