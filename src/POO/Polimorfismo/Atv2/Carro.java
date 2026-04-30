package POO.Polimorfismo.Atv2;

public class Carro extends Veiculo{

    @Override
    public void mover() {
        super.mover();
        System.out.println("Dirigindo!");
    }
}
