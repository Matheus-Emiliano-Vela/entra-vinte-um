package POO.AtividadeAval.Abstracao;

import java.util.ArrayList;
import java.util.List;

public class Missao extends GerenciadorExploracaoEspacial {
    private String objetivo;
    private String dataLancamento;
    private String status;
    private NaveEspacial nave;
    private final List<Astronauta> astronautas;

    public Missao(int id, String nome, String objetivo, String dataLancamento, String status) {
        super(id, nome);
        this.objetivo = objetivo;
        this.dataLancamento = dataLancamento;
        this.status = status;
        this.astronautas = new ArrayList<Astronauta>();
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public String getStatus() {
        return status;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void associarNave(NaveEspacial nave) {
        this.nave = nave;}

    public void associarAstronauta(Astronauta astronauta) {
        this.astronautas.add((Astronauta) astronautas);}

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    @Override
    public void exibirInformacoes() {
        System.out.print("ID: " + getId()
                + ", Nome: " + getNome()
                + ", Objetivo: " + objetivo
                + ", Data: " + dataLancamento
                + ", Status: " + status);

        if (nave == null) {
            System.out.print(", Nave: N/A");
        } else {
            System.out.print(", Nave: " + nave.getNome());
        }

        if (astronautas.isEmpty()) {
            System.out.println(", Astronautas: N/A");
        } else {
            System.out.print(", Astronautas: ");
            for (int i = 0; i < astronautas.size(); i++) {
                System.out.print(astronautas.get(i).getNome());

                if (i < astronautas.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
