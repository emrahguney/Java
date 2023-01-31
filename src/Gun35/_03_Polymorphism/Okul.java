package Gun35._03_Polymorphism;

import java.util.Scanner;

public class Okul {
    /*
    1-Ogrenci isimli  ad , soyad, görevi , subesi olan bir class yazınız
    2-Calisan isimli  ad, soyad, görevi , departmanı olan bir sınıf yazınız.
    3-Yukarıdaki sınıflardan oluşturacağınız 2 adet nesne için de geçerli
    olacak kimlik belgesi formu oluşturan tek bir metod yazınız.
     */
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        createObject(ogr1);

        System.out.println();

        Ogrenci ogr2 = new Calisan();
        createObject(ogr2);


    }

    public static void createObject(Ogrenci ogr7){
        Scanner scStr = new Scanner(System.in);
        if (ogr7 instanceof Calisan) {
            System.out.print("put Calísan name ");
            String name = scStr.next();
            ogr7.setAd(name);
            System.out.print("put Calisan surname ");
            String surname = scStr.next();
            ogr7.setSoyad(surname);
            System.out.print("put Calisan title ");
            String title = scStr.next();
            ogr7.setGorevi(title);
            System.out.print("put Calisan department ");
            String department = scStr.next();
            ((Calisan) ogr7).setDepartman(department);
            System.out.println("Employee inf -> " + ogr7);
        }else {
            System.out.print("put Ogrenci name ");
            String name = scStr.nextLine();
            ogr7.setAd(name);
            System.out.print("put Ogrenci surname ");
            String surname = scStr.nextLine();
            ogr7.setSoyad(surname);
            System.out.print("put Ogrenci title ");
            String title = scStr.nextLine();
            ogr7.setGorevi(title);
            System.out.print("put Ogrenci class ");
            String classroom = scStr.nextLine();
            ogr7.setSubesi(classroom);
            System.out.println("Student inf -> " + ogr7);
        }
    }
}
