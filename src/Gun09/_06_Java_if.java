package Gun09;

import java.util.Scanner;

public class _06_Java_if {
    public static void main(String[] args) {
        //Girilen bir cumlede a harfinin gecip gecmedini bulun geciyor ise EVET gecmiyorsa HAYIR yaz
        Scanner oku=new Scanner(System.in);
        System.out.println("cumle gir = " );
        String cumle= oku.nextLine();


        if (cumle.contains("a"))
        {  System.out.println(" iceriyor " );}

        if(!cumle.contains("a"))    //!degilse if(cumle.contains("a")==false)
        { System.out.println(" icermiyor " );}

        //2.yol
        if (cumle.indexOf("a")!=-1)      //VAR ISE INDEX INDEXINI VERIR
        { System.out.println(" EVET " );}
        if (cumle.indexOf("a")==-1)
        {System.out.println(" HAYIR " );}

        //3.yol
        boolean varMi=cumle.contains("a");
        if (varMi==true) //if(varMi)
        { System.out.println(" EVET " );}
        if (varMi==false)
        { System.out.println("HAYIR " );}








    }
}
