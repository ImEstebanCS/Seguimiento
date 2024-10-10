package practicas.abstractFactory.Model;

import practicas.abstractFactory.interfaces.Instrumento;

public class ViolinFactory extends InstrumentoFactory {
    @Override
    public Instrumento crearInstrumento() {
        return new Violin();
    }
}
