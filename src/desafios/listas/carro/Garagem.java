package desafios.listas.carro;

import java.util.ArrayList;

public class Garagem {
 public static void main(String[] args) {
        ArrayList<Carro> carList = new ArrayList<>();

        Carro car1 = new Carro("VW Golf", "Prata", 2007);
        Carro car2 = new Carro("Ford Fiesta", "Vermelho", 2012);
        Carro car3 = new Carro("Honda Civic", "Preto", 2018);
        Carro car4 = new Carro("Chevrolet Onix", "Branco", 2021);


        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
 }
}
