package POO.AtividadeAval;

public class Astronauta extends GerenciadorExploracaoEspacial {
    private String especialidade;

    public Astronauta(int id, String nome, String especialidade) {
        super(id, nome);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("ID: " + getId() + ", Nome: " + getNome() + ", Especialidade: " + especialidade);
    }
}
