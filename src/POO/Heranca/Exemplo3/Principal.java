package POO.Heranca.Exemplo3;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Bonequinha de Brinquedo");
        produto.setPreco(100d);

        produto.exibirINformacoes();

        System.out.println("=====================");

        Livro livro = new Livro();
        livro.setNome("E não sobou nínguem");
        livro.setPreco(59.90d);
        livro.setAutor("Agatha Christle");

        livro.exibirINformacoes();

    }
}
