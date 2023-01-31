package Gun26._03_Ornek_CONSvePRIcozum;

public class RECTANGLE {
    private int width;
    private int length;


    public void CEVRE(){
        System.out.println("cevre="+2*(width+length));
    }
    public void ALAN(){
        System.out.println("alan="+(width*length));
    }

    public RECTANGLE(int width, int length) {
       setWidth(width);
        setLength(length);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
