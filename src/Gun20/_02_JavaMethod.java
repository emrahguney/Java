package Gun20;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("1.sayi gir=");
        int a= oku.nextInt();
        System.out.print("2.sayi gir=");
        int b= oku.nextInt();


        int enb= enbBul(a,b);
        System.out.println("enb = " + enb);





        }

        //public static ... -->uc nokta koydugumuz yere void den baska birsey yazarsak orasi return tipi olur.Return yapcaksak eger uc noktali yerin tipi ile ayni
    //olmak zorundadir
    public static int enbBul(int a, int b){
        //1.yontem
    //    int donecek;
     //   if (a>b)
     //       donecek=a;
    //    else
     //       donecek=b;
     //   System.out.println("en buyuk"+donecek);
     //  return donecek;

        //2.yontem
    //    return a>b ? a :b;

        //3.yontem
        if (a>b)
            return a;
        else return b;


    }


}
