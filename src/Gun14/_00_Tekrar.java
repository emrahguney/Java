    package Gun14;

    import java.util.Scanner;

    public class _00_Tekrar {
    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);
        System.out.print("Cumle gir = " );
        String cumle= oku.nextLine();

        for (int i = 0; i <cumle.length() ; i++) {

            if (cumle.charAt(i)==' ') continue;


            System.out.println(cumle.charAt(i));
            
        }



        }
        }

