package Gun15;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {
        //Asagidaki gorunumu tek yildiz kullanarak yazdiriniz
        // *****
        // *****
        // *****
        // *****
        // *****

        for (int satir=0; satir<5;satir++){ //satir=0,1,2,3,4


            for(int i=0;i<5;i++)   {     //i=0,1,2,3,4 bu 2.for dongusu bitince System.out.println(); alta  bosluk verip dongusunu bitirir
                System.out.print("*" ); }   //yukardaki 1. for donguye girer tekrar 2. for dongusune 1 arttirir tekrar 2. for dongusune girer ve boyle devam eder yukardaki for dongusu bitine kadar
            System.out.println();
        }
        //ic dongu dis dongunun arttigi kadar artacak ve
        // dis dongu durdugunda duracak.

    }
}
