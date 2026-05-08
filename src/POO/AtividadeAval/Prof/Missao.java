package POO.AtividadeAvaliativaUm.resolucao;

import java.util.List;

public class Missao {
    public static int contadorId = 1;

    private int id;
    private String nome;
    private String objetivo;
    private String dataLancamento;
    private String status;
    private Nave nave;
    private List<Astronauta> astronautas;

    public Missao(
            String nome,
            String dataLancamento,
            String objetivo,
            String status
    ) {
        this.dataLancamento = dataLancamento;
        this.nome = nome;
        this.objetivo = objetivo;
        this.status = status;

        this.id = gerarProximoId();
    }

    public int getId() {
        return id;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void apresentar() {
        String nomeDaNave = this.nave == null ? "N/A" : this.nave.getNome();

        System.out.println("ID: " + this.id +
                " | Nome: " + this.nome +
                " | Status: " + this.status +
                " | Nave: " + nomeDaNave +
                " | Astronautas: " + this.astronautas);
    }

    private int gerarProximoId(){
        return contadorId++;
    }
}
