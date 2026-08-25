package arrays.livro;

import java.util.ArrayList;

public class Livraria {
  public static void main(String[] args) {
        ArrayList<Livro> bookList = new ArrayList<>();

        bookList.add(new Livro("J. K. Rowling", "Harry Potter e a Pedra Filosofal", 1997));
        bookList.add(new Livro("John Green", "A Culpa é das Estrelas", 2012));
        bookList.add(new Livro("J. R. R. Tolkien", "O Senhor dos Anéis: A Sociedade do Anel", 1954));


        System.out.println(bookList.size());
        System.out.println("Total de livros" + bookList.toString());

        for (Livro book : bookList) {
            if (book.getYearOfRelease() >= 2010) {
                System.out.println(book + "->Lançados depois de 2010");
            }
        }
    }
}
