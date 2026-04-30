package POO.Polimorfismo.Atv3;

public class Designer extends Funcionario {

    @Override
    public void trabalhar() {
        super.trabalhar();
        System.out.println("Designer projeta!");
    }
}
