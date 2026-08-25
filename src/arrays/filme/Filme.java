package arrays.filme;

public class Filme {
 private String title ;
    private String gender;
    private double rating;

    public Filme(String title, String gender, double rating) {
        this.title = title;
        this.gender = gender;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getGender() {
        return gender;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", reting=" + rating +
                '}';
    }
}
