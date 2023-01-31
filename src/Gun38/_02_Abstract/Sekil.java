package Gun38._02_Abstract;

public abstract class Sekil {
    private String name;

    abstract double alan();//soyut

    abstract double cevre();//soyut


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +"alan="+alan()+" cevre= "+cevre()+
                '}';
    }

    public void ciz(){
        System.out.println(name+" cizildi");
    }

}