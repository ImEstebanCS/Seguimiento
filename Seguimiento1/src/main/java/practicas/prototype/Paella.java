package practicas.prototype;

public class Paella extends Receta {
    public Paella() {
        super("Paella", 60);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando paella...");
        // Aquí irían los pasos para preparar la paella
    }
}