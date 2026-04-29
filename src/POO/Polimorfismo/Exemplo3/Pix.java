package POO.Polimorfismo.Exemplo3;

public class Pix extends MetodoPagamento{

    @Override
    public void pagarAvista() {
        System.out.println("Pagando à vista...");
    }
}
