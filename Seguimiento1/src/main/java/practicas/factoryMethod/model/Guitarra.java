package practicas.factorymethod.model;

public class Guitarra implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando la guitarra");
    }
}