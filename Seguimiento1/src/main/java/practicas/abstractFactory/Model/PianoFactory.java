package practicas.abstractFactory.Model;

import practicas.abstractFactory.interfaces.Instrumento;

public class PianoFactory extends InstrumentoFactory {
    @Override
    public Instrumento crearInstrumento() {
        return new Piano();
    }
}
