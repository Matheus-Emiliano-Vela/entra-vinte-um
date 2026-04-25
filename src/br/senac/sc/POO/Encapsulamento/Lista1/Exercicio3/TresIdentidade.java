package br.senac.sc.POO.Encapsulamento.Lista1.Exercicio3;

public class TresIdentidade {
    private String nome;
    private int cpf;

    public TresIdentidade(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    void aprensentar(){
        System.out.println("Seu nome é" + this.nome + "e seu CPF é : " + this.cpf);
    }

}
