package POO.Polimorfismo.Atv3;

public class Principal {
    public static void main(String[] args) {
        //Crie uma classe Funcionario com o metodo trabalhar() . Em seguida, crie as subclasses Professor,
        //Programador e Designer . Cada uma deve sobrescrever o metodo
        // com uma descrição específica de sua atividade.

        Professor professor = new Professor();
        Programador programador = new Programador();
        Designer designer = new Designer();

        professor.trabalhar();
        programador.trabalhar();
        designer.trabalhar();

    }
}
