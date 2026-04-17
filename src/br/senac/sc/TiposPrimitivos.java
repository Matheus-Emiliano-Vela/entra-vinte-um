package br.senac.sc;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        byte numeroMuitoPequeno = 12;
        short numeroPequeno = 1000;
         int numeroNormal = 234567890;
         long numeroGrandao = 1234567800;

        System.out.println(numeroMuitoPequeno);
        System.out.println(numeroPequeno);
        System.out.println(numeroNormal);
        System.out.println(numeroGrandao);
        System.out.println("--------------------------");

        //Tipo de números reais;
        float numeroBurro = 24.6f;
        double numeroReal = 123.121;
        System.out.println(numeroBurro);
        System.out.println(numeroReal);
        System.out.println("--------------------------");

        //Char e o Boolean
        char carecte = 'v';
        boolean falso = false;
        boolean verdadeiro = true;
        System.out.println(carecte);
        System.out.println(falso);
        System.out.println(verdadeiro);
        System.out.println("--------------------------");
    }

    public static class SwitchCaseExercisio {
        public static void main(String[] args) {
            int idiomaSelecionado;
            Scanner teclado= new Scanner(System.in);

            System.out.println("Digite um número: ");
            idiomaSelecionado = teclado.nextInt();

            switch(idiomaSelecionado){
                case 1 : {
                    System.out.println("Welcome!");
                    break;
                }
                case 2 : {
                    System.out.println("Bien venido!");
                    break;
                }
                case 3 : {
                    System.out.println("Bienvenue!");
                    break;
                }
                default: {
                    System.out.println("Idioma inválido.");
                }
            }
        }
    }
}
