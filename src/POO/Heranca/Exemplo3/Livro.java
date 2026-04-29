package POO.Heranca.Exemplo3;

public class Livro extends Produto {
    private String autor;

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override //metodo sobrescrito - é uma anotação usada para
              // indicar que um metodo em uma classe substitui (ou reescreve)
              // um metodo herdado de uma classe pai ou de uma interface.
    public void exibirINformacoes() {
        super.exibirINformacoes();
        System.out.println("Autor: " + this.autor);
    }
}
