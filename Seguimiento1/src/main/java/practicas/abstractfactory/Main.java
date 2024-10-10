package practicas.abstractfactory;

import practicas.abstractfactory.model.*;

public class Main {
    public static void main(String[] args) {
        // Crear fábrica de muebles rústicos
        MuebleFactory fabricaRustica = new MesaFactory();

        // Crear muebles rústicos
        Mesa mesaRustica = fabricaRustica.crearMesa();
        Silla sillaRustica = fabricaRustica.crearSilla();

        // Usar muebles rústicos
        mesaRustica.usar();
        sillaRustica.sentarse();

        // Crear fábrica de muebles modernos
        MuebleFactory fabricaModerna = new SillaFactory();

        // Crear muebles modernos
        Mesa mesaModerna = fabricaModerna.crearMesa();
        Silla sillaModerna = fabricaModerna.crearSilla();

        // Usar muebles modernos
        mesaModerna.usar();
        sillaModerna.sentarse();
    }
}

