package practicas;

import org.testng.annotations.Test;
import practicas.abstractfactory.*;
import practicas.factorymethod.Instrumento;
import practicas.factorymethod.InstrumentoFactory;

public class Main {

    @Test
    public void testFactoryMethod() {
        InstrumentoFactory factory = new InstrumentoFactory();

        Instrumento guitarra = factory.crearInstrumento("guitarra");
        guitarra.tocar();
        guitarra.afinar();

        Instrumento piano = factory.crearInstrumento("piano");
        piano.tocar();
        piano.afinar();
    }

    @Test
    public void testAbstractFactory() {
        // Probando la fábrica de muebles modernos
        MuebleFactory fabricaModerna = new SillaFactory();
        Silla sillaModerna = fabricaModerna.crearSilla();
        Mesa mesaModerna = fabricaModerna.crearMesa();

        System.out.println("Probando muebles modernos:");
        sillaModerna.sentarse();
        mesaModerna.usar();

        // Probando la fábrica de muebles rústicos
        MuebleFactory fabricaRustica = new MesaFactory();
        Silla sillaRustica = fabricaRustica.crearSilla();
        Mesa mesaRustica = fabricaRustica.crearMesa();

        System.out.println("\nProbando muebles rústicos:");
        sillaRustica.sentarse();
        mesaRustica.usar();
    }

}
