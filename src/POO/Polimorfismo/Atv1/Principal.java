package POO.Polimorfismo.Atv1;

public class Principal {
    public static void main(String[] args) {
        Animal rex = new Cachorro();
        Animal sushi = new Gato();

        rex.emitirSom();
        sushi.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.perserguirCarteiro();
    }
}