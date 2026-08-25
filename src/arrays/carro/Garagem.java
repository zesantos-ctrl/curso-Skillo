package arrays.carro;

import java.util.ArrayList;

public class Garagem {
 public static void main(String[] args) {
        ArrayList<Carro> carlist = new ArrayList<>();

        carlist.add(new Carro("Mazda Rx7", "Azul"));
        carlist.add(new Carro("Toyata Supra","Vermelho"));
        carlist.add(new Carro("Nissan s15", "Amarelo"));

        System.out.println(carlist.size());
        System.out.println("Total de livros" + carlist.toString());

        for (Carro car : carlist) {
            if (car.getColor() == "Vermelho") {
                System.out.println(car);
            }
        }
    }
}
