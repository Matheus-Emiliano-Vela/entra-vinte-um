package br.senac.sc.vetores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        // crie um array para armarzenar 3 nomes.
        // Peça  do usuario para digitaar os nomes e, em seguida, exiba-os
        String[] nomes = new String[3];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o "+ (i+1)+ "nome: ");
            nomes[i]= teclado.next();

        }

        for(String nome: nomes){
            System.out.println("O nome é: "+ nome);
        }

    }
}
