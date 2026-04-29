package POO.Polimorfismo.Exemplo1;

public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Au au!");

       }

       public void perserguirCarteiro(){
            System.out.println("Volta aqui au aua au");
    }
}
