package practicas.abstractFactory.Model;

import practicas.abstractFactory.interfaces.Instrumento;

public class GuitarraFactory extends InstrumentoFactory {
    @Override
    public Instrumento crearInstrumento() {
        return new Guitarra();
    }
}
