package Gun35._01_Final.MethodsFinal;

public class Araclar {
    private String model;

    public String getModel() {
        return model;
    }

    public Araclar(String model) {
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public final String toString() {
        return "Araclar{" +
                "model='" + model + '\'' +
                '}';
    }
}
