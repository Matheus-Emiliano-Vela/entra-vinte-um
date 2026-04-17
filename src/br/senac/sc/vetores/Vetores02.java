package br.senac.sc.vetores;

public class Vetores02 {
    public static void main(String[] args) {
        //Inicialização padrão
        //byte, short, int, long, float e double -> Inicializador com 0
        int[] numeros= new int[5];

        numeros[3] = 5;
        System.out.println(numeros[4]);
        System.out.println(numeros[3]);

        //char = espaço en branco
        char[] caracteres = new char[3];
        System.out.println(caracteres[1]);

        //booelan - falso
        boolean[]logicos = new boolean[3];
        System.out.println(logicos[2]);

        //Objetos -> null
        String[] textos = new String[3];
        textos[1] = "Vasco";
        System.out.println(textos[1]);
        System.out.println(textos[2]);

    }
}
