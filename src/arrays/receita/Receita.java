package arrays.receita;

public class Receita {
private String name;
    private int prepTime;

    public Receita(String name, int preparationTime) {
        this.name = name;
        this.prepTime = preparationTime;
    }

    public String getName() {
        return name;
    }

    public int getPrepTime() {
        return prepTime;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", preparationTime=" + prepTime +
                '}';
    }
}
