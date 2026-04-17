package br.senac.sc;

public class Condicionais {
    public static void main(String[] args) {

        if(3 < 5) {
            //SE
            System.out.println("Maior");
        } else {
            //SENAO
            System.out.println("Menor");
        }

        int age = 18;

        if (age < 18){
            System.out.println("Menor de idade");
        } else if (age == 18) { //SENAO SE//
            System.out.println("18 anos");
        }else {
            System.out.println("Maior de idade");
        }
             System.out.println("------------------------------");


        String corCamisa = "preto e branco";
        String corCamisaDois = "Alvinegro";

        if (corCamisa == "preto e branco" || corCamisa == "Alvinegro"){
            System.out.println("Vasco");
        }
            System.out.println("------------------------------");

        int ano = 2020;
        //&& == e
        if (ano >= 2000 && ano <= 2999){
            System.out.println("Século 21");
        }
            System.out.println("------------------------------");
    }
}
