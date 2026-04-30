package POO.Polimorfismo.Atv2;

public class Bicicleta extends Veiculo{

    @Override
    public void mover() {
        super.mover();
        System.out.println("Pedalando!");
    }
}
