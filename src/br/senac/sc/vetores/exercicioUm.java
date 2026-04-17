package br.senac.sc.vetores;

import java.util.Scanner;

public class exercicioUm {
    public static void main(String[] args) {
        //: Declare um array para armazenar  idades. Peça ao usuário
        //para preencher o array e, em seguida, exiba todas as idades.

        int[] ages= new int[3];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Write your "+ (i+1) +" age: ");
            ages[i]= teclado.nextInt();
        }
        for (int age: ages ){
            System.out.println("Your age are:"+ age);
        }
    }
}

