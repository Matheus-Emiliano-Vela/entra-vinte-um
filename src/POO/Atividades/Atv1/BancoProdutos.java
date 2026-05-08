package POO.Atividades.Atv1;

import java.util.ArrayList;
import java.util.List;

public class BancoProdutos {

    private final List<Produtos[]> produtos = new ArrayList<>();

    public void adicionar(Produtos produtos) {
        produtos.add(produtos);
    }

       public void listar(){
           System.out.println("\n---Nomear de Produtos---");
           if(produtos.isEmpty()){
               System.out.println("Sem Produtos nomeados");
               return;
           }
           for (Produtos[] produtos : produtos) produtos.aprensentar();
       }
}
