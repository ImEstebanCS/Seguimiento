package practicas.abstractfactory.model;

public class SillaRustica implements Silla {
    @Override
    public void sentarse() {
        System.out.println("Sentándose en una silla rústica");
    }
}