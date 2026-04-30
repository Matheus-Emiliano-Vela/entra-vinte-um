package POO.Polimorfismo.Atv3;

public class Programador extends Funcionario{

    @Override
    public void trabalhar() {
        super.trabalhar();
        System.out.println("Programdor programa!");
    }
}
