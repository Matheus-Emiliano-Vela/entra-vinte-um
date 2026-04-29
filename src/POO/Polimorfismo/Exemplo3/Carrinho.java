package POO.Polimorfismo.Exemplo3;

public class Carrinho {
    private double valorCompra;

    public Carrinho(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void realizarCompra(MetodoPagamento metodoPagemnto){
     metodoPagemnto.pagarAvista();
        System.out.println("Compra realizada com sucesso!");
    }
}
