package POO.Polimorfismo.Atv1;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Meaaau meauu");
    }
}
