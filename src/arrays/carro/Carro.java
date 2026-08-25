package arrays.carro;

public class Carro {
    private String model;
    private String color;

    public Carro(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
