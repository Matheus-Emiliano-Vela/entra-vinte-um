package POO.AtividadeAval.Prof;

import java.util.ArrayList;
import java.util.List;

public class BancoNave {
    private List<Nave> naves = new ArrayList<>();

    public void adicionar(Nave nave) {
        naves.add(nave);
    }

    public void listar() {
        System.out.println("\n--- Lista de Naves Espaciais ---");
        if (naves.isEmpty()) {
            System.out.println("Nenhuma nave cadastrada.");
            return;
        }

        for (Nave nave : naves) {
            nave.apresentar();
        }
    }

    public Nave findById(int id) {
        Nave naveEncontrada = null;

        for (Nave nave : naves) {
            if (nave.getId() == id) {
                naveEncontrada = nave;
                break;
            }
        }

        return naveEncontrada;
    }
}
