package arrays.filme;

import java.util.ArrayList;

public class Cinema {
 public static void main(String[] args) {
        ArrayList<Filme> FilmeList  = new ArrayList<>();

        FilmeList.add(new Filme("Inception", "Ficção Científica", 9.0));
        FilmeList.add(new Filme("O Poderoso Chefão", "Drama", 9.5));
        FilmeList.add(new Filme("Toy Story", "Animação", 8.5));

        System.out.println("Filmes com avaliação alta: ");
        for (Filme Filme : FilmeList){
            if (Filme.getRating() >= 8) {
                System.out.println(Filme);
            }
        }
    }
}
