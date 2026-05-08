package POO.Atividades.Atv1;

import java.util.ArrayList;
import java.util.List;

public class BancoEstoque{
    private final List<Estoque[]> estoque = new ArrayList<>();

    public void adicionar(Estoque estoque) {
        estoque.add(estoque);
    }

    public void listar(){
        System.out.println("\n---Estoque---");
        if(estoque.isEmpty()){
            System.out.println("Estoque Zerado!");
            return;
        }
        for (Estoque[] estoque : estoque){
            Estoque. ExibirProdutos();
        }
    }
}
