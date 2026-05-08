package POO.AtividadeAvaliativaUm.resolucao;

public class Astronauta {
    public static int contadorId = 1;

    private int id;
    private String nome;
    private String especialidade;

    public Astronauta(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;

        this.id = gerarProximoId();
    }

    public void apresentar() {
        System.out.println(
                        "ID: " + this.id +
                        " | Nome: " + this.nome +
                        " | Especialidade: " + this.especialidade
        );
    }

    private int gerarProximoId(){
        return contadorId++;
    }

}
