package practicas.factorymethod;

import practicas.factorymethod.model.Instrumento;

public class Main {
    public static void main(String[] args) {
        InstrumentoFactory factory = new InstrumentoFactory();

        // Crear y usar una guitarra
        Instrumento guitarra = factory.crearInstrumento("guitarra");
        guitarra.afinar();
        guitarra.tocar();

        // Crear y usar un piano
        Instrumento piano = factory.crearInstrumento("piano");
        piano.afinar();
        piano.tocar();

        // Crear y usar un violin
        Instrumento violin = factory.crearInstrumento("violin");
        violin.afinar();
        violin.tocar();
    }
}
