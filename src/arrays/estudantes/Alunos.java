package arrays.estudantes;

public class Alunos {
 private String name;
    private double grade;

    public Alunos(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", note=" + grade +
                '}';
    }
}
