package br.senac.sc.lista;

import java.util.Scanner;

public class listaTres2 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o Primeiro número: ");
        num1= teclado.nextInt();
        System.out.println("Digite o Segundo número: ");
        num2= teclado.nextInt();
        System.out.println("Digite o tercerio número: ");
        num3= teclado.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3){ // "|| (ou)"
            System.out.println("Dois Iguais");
        } else {
            System.out.println("Nenhum igual");
        }

    }
}
