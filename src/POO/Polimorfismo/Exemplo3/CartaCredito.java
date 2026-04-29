package POO.Polimorfismo.Exemplo3;

public class CartaCredito extends MetodoPagamento{

    @Override
    public void pagarAvista() {
        System.out.println("Pagando com Cartão de credito...");
    }
}
