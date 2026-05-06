package POO.AtividadeAval.Abstracao;

public abstract class GerenciadorExploracaoEspacial {
    private int id;
    private String nome;

    public GerenciadorExploracaoEspacial(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes(){
        System.out.println("ID: " + id + ", Nome: " + nome);
    }
}
