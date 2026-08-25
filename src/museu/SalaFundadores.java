package museu;

public class SalaFundadores extends Sala {
    //Falando sobre o James Gosling e Sun Microsystems

    public SalaFundadores(String nome, String descricao, int anoCriacao) {
        super(nome, descricao, anoCriacao);
    }

    public void exibirConteudo() {
        String sobreFundadores = """
                
                - James Goslin: 'pai do Java'
                - Criado na Sun Microsystem em 1991, lançado em 1995
                - O objetivo inicial era para dispositivos eletrônicos e televisores interativos
                
                """;
        System.out.println(sobreFundadores);
    }
}