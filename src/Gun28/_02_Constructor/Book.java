package Gun28._02_Constructor;

public class Book {

    String name;
    int yayinyili;
    String yazar;

    public Book() {
    }

    public Book(String name, int yayinyili, String yazar) {
        this.name = name;
        this.yayinyili = yayinyili;
        this.yazar = yazar;
    }

    public Book(String name, int yayinyili) {
        this.name = name;
        this.yayinyili = yayinyili;
        if (yazar==null)
            yazar="";
    }

    public Book(String name, String yazar) {
        this.name = name;
        this.yazar = yazar;
    }


    public String toString() {
        if (yazar==null )
            yazar="";

        return  name +" "+ yayinyili+" " + yazar ;
    }


}
