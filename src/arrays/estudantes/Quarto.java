package arrays.estudantes;

import java.util.ArrayList;

public class Quarto {
public static void main(String[] args) {
        ArrayList<Alunos> studentsList = new ArrayList<>();



        studentsList.add(new Alunos("José V.", 10));
        studentsList.add(new Alunos("Ingrid B.", 2));
        studentsList.add(new Alunos("Gabriel K.", 8));
        studentsList.add(new Alunos("Mariana V.", 9));

        double soma = 0;
        double media = 0;
        for (Alunos students : studentsList){
            soma += students.getGrade();
            media = soma / studentsList.size();
        }

        for (Alunos students : studentsList) {
            if (students.getGrade() >= 7){
                System.out.println(students + " - Aprovado");
            } else {
                System.out.println(students + " - Reprovados");
            }
        }

    }
}
