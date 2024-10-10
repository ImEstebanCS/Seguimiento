package practicas.prototype;

public class Ramen extends Receta {
    public Ramen() {
        super("Ramen", 30);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando ramen...");
        // Aquí irían los pasos para preparar el ramen
    }
}