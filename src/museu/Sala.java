package museu;

 public abstract class Sala {
    private String nome;
    String descricao;
    int anoCriacao;

    Sala(String nome, String descricao, int anoCriacao) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public abstract void exibirConteudo();
}






