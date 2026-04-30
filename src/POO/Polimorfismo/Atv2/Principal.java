package POO.Polimorfismo.Atv2;

public class Principal {
    public static void main(String[] args) {
        //Crie uma class Veiculo com o metodo mover(). Crie as classes Carro e Bicicleta,
        //sobrescrevendo o metodo para indicar como cada veículo se move. Teste usando variáveis do tipo Veiculo
        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();

        carro.mover();
        bicicleta.mover();
    }
}
