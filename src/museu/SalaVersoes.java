package museu;

public class SalaVersoes extends Sala{

    public SalaVersoes(String nome, String descricao, int anoCriacao) {
        super(nome, descricao, anoCriacao);
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Principais versões do Java:");
        System.out.println("- Java 1.0 (1995): primeira versão oficial");
        System.out.println("- Java 5 (2004): introduziu Generics e Annotations");
        System.out.println("- Java 8 (2014): trouxe Lambda Expressions e Stream API");
        System.out.println("- Java 17 (2021): versão LTS com novas melhorias");
    }
}

