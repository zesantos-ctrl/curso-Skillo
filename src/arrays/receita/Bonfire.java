package arrays.receita;

import java.util.ArrayList;

public class Bonfire {
    public static void main(String[] args) {
        ArrayList<Receita> ReceitaList = new ArrayList<>();

        ReceitaList.add(new Receita("Panqueca de Banana", 12));
        ReceitaList.add(new Receita("Omelete de Queijo", 8));
        ReceitaList.add(new Receita("Bolo de Chocolate", 45));

        for (Receita Receita : ReceitaList) {
            if (Receita.getPrepTime() <= 30) {
                System.out.println(Receita);
                System.out.println(Receita + " - Receita rapida: " + Receita.getName());
            }
        }

    }
}
