package POO.Atividades.Atv1;

import java.util.ArrayList;
import java.util.List;

public class Estoque extends SistemaInventarioProcedural{
    int Quantidade;
    private List<Produtos> produtos;

    public Estoque(String nome, double valor, int quantidade) {
        super(nome, valor, quantidade);
    }



    @Override
    public int getQuantidade() {
        return Quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public static void ExibirProdutos(){
        System.out.println("Produto: " + getNome() + ", Estoque Atual: : "
                + getQuantidade() + ", Valor de Estoque: " + SomarTotal());
    }

    public void add(Estoque estoque) {
    }

}
