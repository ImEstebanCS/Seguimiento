package practicas.factorymethod;

import practicas.factorymethod.model.Guitarra;
import practicas.factorymethod.model.Instrumento;
import practicas.factorymethod.model.Piano;
import practicas.factorymethod.model.Violin;

public class InstrumentoFactory {
    public Instrumento crearInstrumento(String tipo) {
        if (tipo.equalsIgnoreCase("guitarra")) {
            return new Guitarra();
        } else if (tipo.equalsIgnoreCase("piano")) {
            return new Piano();
        } else if (tipo.equalsIgnoreCase("violin")) {
            return new Violin();
        }
        return null;
    }
}