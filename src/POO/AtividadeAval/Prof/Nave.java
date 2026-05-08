package POO.AtividadeAval.Prof;

public class Nave {
    public static int contadorId = 1;

    private int id;
    private String nome;
    private String tipo;
    private int capacidade;

    public Nave(String nome, String tipo, int capacidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.capacidade = capacidade;

        this.id = gerarProximoId();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void apresentar() {
        System.out.println(
                        "ID: " + this.id +
                        " | Nome: " + this.nome +
                        " | Tipo: " + this.tipo +
                        " | Cap: " + this.capacidade
        );
    }

    private int gerarProximoId() {
        return contadorId++;
    }
}
