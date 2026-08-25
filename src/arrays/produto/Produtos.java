package arrays.produto;

public class Produtos {
 private String name;
    private double preco;

    public Produtos(String name, double preco) {
        this.name = name;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", preco=" + preco +
                '}';
    }
}
