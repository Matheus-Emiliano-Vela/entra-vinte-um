package POO.Polimorfismo.Exemplo2;

public class Gerente extends Funcionario{

    @Override
    public double getSalarioBase() {
        return super.getSalarioBase() + 1_000d;
    }
}
