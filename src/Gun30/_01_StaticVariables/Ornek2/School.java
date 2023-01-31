package Gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {

        Student ogr1=new Student(1, "Ismet Temur");
        Student ogr2=new Student(2, "Mehmet Yilmaz");
        Student ogr3=new Student(3, "Beyza Demir");
        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);

        //Problem: hem id yi takip etmek zorundayim, hemde hata olasiligi yuksek


        Student ogr10=new Student("Ismet Temur");
        Student ogr11=new Student("Mehmet Yilmaz");
        Student ogr12=new Student("Beyza Demir");
        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);


    }
}
