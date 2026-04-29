package POO.Heranca.Atv1;

public class Principal {
        public static void main(String[] args) {
          Pessoa pessoa = new Pessoa("Matheus",18);
          Aluno aluno = new Aluno("Matheus", 18, 51613);

            aluno.apresentar();

            System.out.println("Meu nome: " + aluno.getNome());
            System.out.println("Idade do aluno: " + aluno.getIdade());
            System.out.println("Matricula: " + aluno.getMatricula());


    }
}