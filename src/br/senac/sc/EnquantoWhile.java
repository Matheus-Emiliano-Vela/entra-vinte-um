package br.senac.sc;

import java.util.Scanner;

public class EnquantoWhile {
    public static void main(String[] args) {
       //Enquanto
        //Peça para o usuario digitar um nuemro até digitar um numero negativo

        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        num = teclado.nextInt();
        //Enquanto
        while (num >= 0 ){
            System.out.println("Digite um Número: ");
            num = teclado.nextInt();
        }

    }
}
