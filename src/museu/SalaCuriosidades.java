package museu;

public class SalaCuriosidades extends Sala {
    public SalaCuriosidades(String nome, String descricao, int anoCriacao) {
        super(nome, descricao, anoCriacao);
    }

    @Override
    public void exibirConteudo() {
        System.out.println("===== Curiosidades sobre Java =====");
        System.out.println("-> O nome 'Java' vem de um tipo de café");
        System.out.println("-> O mascote oficial é o Duke");
        System.out.println("-> É uma das linguagens mais usadas no mundo corporativo");
    }
}
