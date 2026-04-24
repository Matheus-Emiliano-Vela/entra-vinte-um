package br.senac.sc.Basico.POO.Basico.Excecoes;

import java.util.Scanner;

public class Excecao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite outro número: " );
        num2 = scanner.nextInt();

        try{
            double divisao = num1 / num2;
            System.out.println(divisao);
        } catch (ArithmeticException exception){
            System.out.println("Não pode dividir por zero, bobão!");
        }

        //OUTRA MANEIRA

        if (num2 ==0){
            System.out.println("Não pode dividir por zero, bobão!");
        } else {
            System.out.println(num1/num2);
        }
    }
}
