package POO.Encapsulamento.Lista1.Exercicio1;

public class UmLivro {
    private String autor;
    private String titulo;

    public UmLivro(String autor, String titulo){
        this.autor = autor;
        this.titulo = titulo;
    }

    void apresentar (){
        System.out.println("O nome do Autor é: " + this.autor);
        System.out.println("O tutilo do livro é: " + this.titulo);


    }
}
