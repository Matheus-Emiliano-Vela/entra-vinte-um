package POO.AtividadeAval.Prof;

import java.util.ArrayList;
import java.util.List;

public class BancoAstronauta {

    private List<Astronauta> astronautas = new ArrayList<>();

    public void adicionar(Astronauta astronauta) {
        astronautas.add(astronauta);
    }

    public void listar() {
        System.out.println("\n--- Lista de Astronautas ---");
        if (astronautas.isEmpty()) {
            System.out.println("Nenhum astronauta cadastrado.");
            return;
        }

        for (Astronauta astronauta : astronautas) {
            astronauta.apresentar();
        }
    }
}
