package desafios.listas.alunos;

public class Aluno {
 private String name;
    private double note;

    Aluno(String name, double note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public double getNota() {
        return note;
    }

    @Override
    public String toString() {
        return "\"" + name + "\" - note: " + note;
    }

}
