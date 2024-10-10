package practicas.abstractfactory.model;


public class SillaModerna implements Silla {
    @Override
    public void sentarse() {
        System.out.println("Sentándose en una silla moderna");
    }
}