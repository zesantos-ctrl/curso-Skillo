package arrays.viagem;

import java.util.ArrayList;

public class Mapa {
    public static void main(String[] args) {
        ArrayList<Viagem> travelList = new ArrayList<>();

        travelList.add(new Viagem("Paris", 5));
        travelList.add(new Viagem("Nova York", 7));
        travelList.add(new Viagem("Tóquio", 10));

        System.out.println("Duram mais de 7 dias: ");
        for (Viagem travel : travelList) {
            if (travel.getDurationDays() >= 7) {
                System.out.println(travel);
            }
        }
    }
}
