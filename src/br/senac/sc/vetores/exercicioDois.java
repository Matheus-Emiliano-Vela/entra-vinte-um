package br.senac.sc.vetores;

import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args) {
        //Crie um array para  notas de um aluno. Peça as notas, calcule e
        //exiba a média final.
        double[] notes= new double[4];
        Scanner teclado= new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < notes.length; i++){

            System.out.println("Write "+(i+1)+" student's grade: ");
            notes[i]= teclado.nextDouble();
            soma = soma + notes[1];
        }


            System.out.println("The media average is: " + soma/notes.length);



    }
}
