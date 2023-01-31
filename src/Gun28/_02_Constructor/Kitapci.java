package Gun28._02_Constructor;

public class Kitapci {
    public static void main(String[] args) {
        // Book class yazınız.fields: name,publishYear,author.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.


        Book kitap1=new Book();
        kitap1.name="Vakif";
        kitap1.yayinyili=1960;
        kitap1.yazar="Isaac Asimov";
        System.out.println(kitap1.name+" "+kitap1.yayinyili+" "+kitap1.yazar);


        Book kitap2=new Book("Vakif2",1961);

        System.out.println(kitap2.name+" "+kitap2.yayinyili+" "+kitap2.yazar);
        //System.out.println(kitap2.name);

        Book kitap3=new Book("Vakif3",1962,"Asimov");

        System.out.println(kitap3.name+" "+kitap3.yayinyili+" "+kitap3.yazar);

        System.out.println(kitap1);
        System.out.println(kitap2);
        System.out.println(kitap3);
    }
}
