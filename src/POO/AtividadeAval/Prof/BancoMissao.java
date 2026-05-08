package POO.AtividadeAvaliativaUm.resolucao;

import java.util.ArrayList;
import java.util.List;

public class BancoMissao {
    private List<Missao> missoes = new ArrayList<>();

    public void adicionar(Missao missao) {
        missoes.add(missao);
    }

    public void listar() {
        System.out.println("\n--- Lista de Missões ---");
        if (missoes.isEmpty()) {
            System.out.println("Nenhuma missão cadastrada.");
            return;
        }
        for (Missao missao : missoes) {
            missao.apresentar();
        }
    }

    public Missao findById(int id) {
        Missao missaoEncontrada = null;

        for (Missao missao : missoes) {
            if (missao.getId() == id) {
                missaoEncontrada = missao;
                break;
            }
        }

        return missaoEncontrada;
    }
}
