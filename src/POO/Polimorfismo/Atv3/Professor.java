package POO.Polimorfismo.Atv3;

public class Professor extends Funcionario {

    @Override
    public void trabalhar() {
        super.trabalhar();
        System.out.println("Professor Leciona!");
    }
}
