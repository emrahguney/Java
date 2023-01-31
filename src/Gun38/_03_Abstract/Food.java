package Gun38._03_Abstract;

public abstract class Food {
private String name;
    abstract public String madeIn();
    abstract public String taste();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +"made in="+madeIn()+" taste="+taste()+
                '}';
    }
}
