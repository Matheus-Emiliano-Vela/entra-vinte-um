package br.senac.sc.lista;

import java.util.Scanner;

public class listaDois {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        int idade;

        System.out.println("Write your age: ");
        idade = age.nextInt();

        if (idade >=18) {
            System.out.println("Você é maior de idade: " + idade + " years old.");
        } else {
        System.out.println("Você é menor de idade: " + idade+ " years old.");
        }


    }
}

