package POO.Polimorfismo.Atv1;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("raw raw ");

       }

       public void perserguirCarteiro(){
            System.out.println("sai chacorro");
    }
}
