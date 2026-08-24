package desafios.listas.alunos;

import java.util.ArrayList;

public class ClasseAluno {
 public static void main(String[] args) {
        ArrayList<Aluno> studentList = new ArrayList<>();

        Aluno student1 = new Aluno("Zé", 10.0);
        Aluno student2 = new Aluno("Gabriel K.", 10.0);
        Aluno student3 = new Aluno("Ingrid B.", 2.0);


        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);


        for (Aluno student : studentList) {
            if(student.getNota() >= 7) {
                System.out.println("Alunos aprovado: ");
                System.out.println(student);
            } else {
                System.out.println("Alunos reprovados: ");
            }
        }

    }
}
