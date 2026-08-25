package arrays.produto;

import java.util.ArrayList;

public class Mercado {
public static void main(String[] args) {
        ArrayList<Produtos> ProdutosList = new ArrayList<>();

        Produtos Produtos1 = new Produtos("Coca-Cola", 10.0);
        Produtos Produtos2 = new Produtos("Café", 31.10);
        Produtos Produtos3 = new Produtos("Leite", 5.03);

        ProdutosList.add(Produtos1);
        ProdutosList.add(Produtos2);
        ProdutosList.add(Produtos3);

        System.out.println(ProdutosList.size());
        System.out.println("Total de produtos " + ProdutosList.toString());

        Produtos expensiveProdutos = ProdutosList.get(0);

        for (Produtos Produtos : ProdutosList) {
            if (Produtos.getPreco() > expensiveProdutos.getPreco()) {
                expensiveProdutos = Produtos;
            }
        }
        System.out.println("Produto mais caro: " + expensiveProdutos);
    }
}
