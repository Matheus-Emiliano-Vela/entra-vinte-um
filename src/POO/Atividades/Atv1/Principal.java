package POO.Atividades.Atv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Principal extends SistemaInventarioProcedural {
    // "Banco de dados" em memória: [Nome, Preco, Quantidade]
    private static List<String[]> produtos = new ArrayList<>();

    public Principal(String nome, double valor, int quantidade) {
        super(nome, valor, quantidade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n--- Inventário ---");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Calcular Valor Total do Estoque");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    String preco = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    String qtd = scanner.nextLine();
                    adicionarProduto(nome, preco, qtd);
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    calcularTotal();
                    break;
            }
        } while (opcao != 0);
    }
    public static void adicionarProduto(String nome, String preco, String
            qtd) {
        produtos.add(new String[]{nome, preco, qtd});
        System.out.println("Produto adicionado!");
    }
    public static void listarProdutos() {
        System.out.println("\n--- Lista de Produtos ---");
        for (String[] p : produtos) {
            System.out.println("Produto: " + p[0] + " | Preço: R$" + p[1] +
                    " | Qtd: " + p[2]);
        }
    }
    public static void calcularTotal() {
        double total = 0;
        for (String[] p : produtos) {
// Perigo: conversão direta de strings soltas
            double preco = Double.parseDouble(p[1]);
            int qtd = Integer.parseInt(p[2]);
            total += preco * qtd;
        }
        System.out.println("Valor total do estoque: R$ " + total);
    }
}