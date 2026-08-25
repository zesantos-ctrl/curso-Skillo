package arrays.viagem;

public class Viagem {
    private String destiny;
    private int durationDays;

    public Viagem(String destiny, int durationDays) {
        this.destiny = destiny;
        this.durationDays = durationDays;
    }

    public String getDestiny() {
        return destiny;
    }

    public int getDurationDays() {
        return durationDays;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "destiny='" + destiny + '\'' +
                ", durationDays=" + durationDays +
                '}';
    }
}
