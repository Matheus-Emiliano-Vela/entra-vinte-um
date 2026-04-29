package POO.Encapsulamento.Lista1.Exercicio2;

public class DoisCarro {
    private String marca;
    private String modelo;

    public DoisCarro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    void aprensentar (){
        System.out.println("A marca do seu carro é: " + this.marca);
        System.out.println("O modelo do seu carro é: " + this.modelo);
    }
}
