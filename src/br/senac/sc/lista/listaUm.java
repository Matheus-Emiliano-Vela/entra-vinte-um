package br.senac.sc.lista;

import java.util.Scanner;

//Escreva um programa que verifique se um número é positivo ou negativo e exiba uma mensagem correspondente.
public class listaUm {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        double numero;

        System.out.println("Digite um número: ");
        numero = number.nextDouble();

        if(numero >0) {
            System.out.println("Número postivo: " + numero);
        } else if (numero < 0){
            System.out.println("Número negativo: " + numero);
        }else {
            System.out.println("É zero!");
        }

    }
}

