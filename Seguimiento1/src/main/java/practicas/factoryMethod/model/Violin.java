package practicas.factorymethod.model;


public class Violin implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando el violin");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando el violin");
    }
}