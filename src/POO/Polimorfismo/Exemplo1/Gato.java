package POO.Polimorfismo.Exemplo1;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Miau miau >//<");
    }
}
