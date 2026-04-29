package POO.Polimorfismo.Exemplo3;

public class Boleto extends MetodoPagamento{

    @Override
    public void pagarAvista() {
        System.out.println("Pagando com o Boleto...");
    }
}
