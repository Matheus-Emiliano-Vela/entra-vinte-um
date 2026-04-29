package POO.Polimorfismo.Exemplo3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo!");
        System.out.println("Digite o valor da compra: ");
        double valorDacompra= scanner.nextDouble();

        System.out.println("Escolha a fomra do pagamento");
        System.out.println("[1] - Pix");
        System.out.println("[2] - Boleto");
        System.out.println("[3] - Cartão de Crédito");
        System.out.println("");

        Carrinho carrinho = new Carrinho(valorDacompra);
        int formaDePagamento = scanner.nextInt();

        switch (formaDePagamento){
            case 1:{
                carrinho.realizarCompra(new Pix());
                break;
            }
            case 2:{
                carrinho.realizarCompra(new Boleto());
                break;
            }
            case 3:{
                carrinho.realizarCompra(new CartaCredito());
                break;
            }
            default:{
                throw new IllegalAccessException();
            }
        }

    }
}
