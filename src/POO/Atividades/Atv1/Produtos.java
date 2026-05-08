package POO.Atividades.Atv1;

import java.util.List;

public class Produtos extends SistemaInventarioProcedural{
    public static int contadorBarras = 1;

    private String nome;
    private int codBarras;
    private double valor;
    private List<BancoEstoque> estoque;

    public Produtos(String nome, double valor, int quantidade, String nome1,
                    int codBarras, int valor1, List<Produtos> produtos) {
        super(nome, valor, quantidade);
        this.nome = nome1;
        this.codBarras = codBarras;
        this.valor = valor1;
        this.produtos = produtos;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void ExibirProdutos(){
        System.out.println("Produto: " + getNome() + ", Estoque Atual: : "
                + getQuantidade() + ", Valor de Estoque: " + SomarTotal());
    }

}
