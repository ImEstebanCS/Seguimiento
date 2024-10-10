package practicas.abstractFactory.Model;

import practicas.abstractFactory.interfaces.Instrumento;


class Saxofon implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando el saxofón con viento.");
    }

    @Override
    public String getNombre() {
        return "Saxofón";
    }
}


class SaxofonFactory extends InstrumentoFactory {
    @Override
    public Instrumento crearInstrumento() {
        return new Saxofon();
    }
}
