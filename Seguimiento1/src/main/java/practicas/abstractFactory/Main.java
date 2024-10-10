package practicas.abstractFactory;

import practicas.abstractFactory.Model.GuitarraFactory;
import practicas.abstractFactory.Model.InstrumentoFactory;
import practicas.abstractFactory.Model.PianoFactory;
import practicas.abstractFactory.Model.ViolinFactory;
import practicas.abstractFactory.interfaces.Instrumento;

public class Main {
    public static void main(String[] args) {

        InstrumentoFactory guitarraFactory = new GuitarraFactory();
        Instrumento guitarra = guitarraFactory.crearInstrumento();
        guitarra.tocar();

        InstrumentoFactory pianoFactory = new PianoFactory();
        Instrumento piano = pianoFactory.crearInstrumento();
        piano.tocar();

        InstrumentoFactory violinFactory = new ViolinFactory();
        Instrumento violin = violinFactory.crearInstrumento();
        violin.tocar();
    }
}

