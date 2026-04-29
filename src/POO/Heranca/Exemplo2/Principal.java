package POO.Heranca.Exemplo2;

public class Principal {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor(
                "Jean", 100000, 500000);

        System.out.println(" O sálario total de "
        + vendedor.getNome() +
        " é " + vendedor.getSalarioTotal());

    }

}
