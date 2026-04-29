package POO.Heranca.Atv2;

import org.w3c.dom.ls.LSOutput;

public class Principal {
    public static void main(String[] args) {


    //Crie uma classe  Pessoa com  nome e com o atributo email. Depois, crie uma
    // subclasseProfessor disciplina. Instancie um professor e mostre uma
    // mensagem com nome, e-mail e disciplina.

    Pessoa pessoa = new Pessoa("matheus", "@bluestudiodos.com.bl");
    Professor professor = new Professor("girafales", "@mestrelinguica", "Chaves");

        System.out.println("Email do aluno: " + pessoa.getNome() + pessoa.getEmail());
        System.out.println(" Estudante da disciplina: " + professor.getDisciplina());
        System.out.println("==============================================");
        System.out.println("Email do professor: " + professor.getNome()+ professor.getEmail());
        System.out.println("Lecionar na discilina : " + professor.getDisciplina());

    }
}
