package practicas;

import practicas.abstractfactory.*;
import practicas.abstractfactory.model.Mesa;
import practicas.abstractfactory.model.Silla;
import practicas.factorymethod.model.Instrumento;
import practicas.factorymethod.InstrumentoFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
//
//    public static void main(String[] args) {
//        Main demo = new Main();
//        demo.demoFactoryMethod();
//        demo.demoAbstractFactory();
//        demo.demoTodosLosInstrumentos();
//        demo.simularOrquesta();
//    }
//
//    public void demoFactoryMethod() {
//        System.out.println("Demostracion Factory Method:");
//        InstrumentoFactory factory = new InstrumentoFactory();
//
//        Instrumento guitarra = factory.crearInstrumento("guitarra");
//        guitarra.tocar();
//        guitarra.afinar();
//
//        Instrumento piano = factory.crearInstrumento("piano");
//        piano.tocar();
//        piano.afinar();
//
//        System.out.println();
//    }
//
//    public void demoAbstractFactory() {
//        System.out.println("Demostracion Abstract Factory:");
//        // Probando la fábrica de muebles modernos
//        MuebleFactory fabricaModerna = new SillaFactory();
//        Silla sillaModerna = fabricaModerna.crearSilla();
//        Mesa mesaModerna = fabricaModerna.crearMesa();
//
//        System.out.println("Probando muebles modernos:");
//        sillaModerna.sentarse();
//        mesaModerna.usar();
//
//        // Probando la fábrica de muebles rústicos
//        MuebleFactory fabricaRustica = new MesaFactory();
//        Silla sillaRustica = fabricaRustica.crearSilla();
//        Mesa mesaRustica = fabricaRustica.crearMesa();
//
//        System.out.println("\nProbando muebles rústicos:");
//        sillaRustica.sentarse();
//        mesaRustica.usar();
//
//        System.out.println();
//    }
//
//    public void demoTodosLosInstrumentos() {
//        System.out.println("Demostracion de todos los instrumentos:");
//        InstrumentoFactory factory = new InstrumentoFactory();
//        String[] tiposInstrumentos = {"guitarra", "piano", "violin"};
//
//        for (String tipo : tiposInstrumentos) {
//            Instrumento instrumento = factory.crearInstrumento(tipo);
//            System.out.println("Probando " + tipo + ":");
//            instrumento.afinar();
//            instrumento.tocar();
//            System.out.println();
//        }
//    }
//
//    public void simularOrquesta() {
//        System.out.println("Simulacion de una orquesta:");
//        InstrumentoFactory factory = new InstrumentoFactory();
//        List<Instrumento> orquesta = new ArrayList<>();
//
//        orquesta.add(factory.crearInstrumento("violin"));
//        orquesta.add(factory.crearInstrumento("piano"));
//        orquesta.add(factory.crearInstrumento("guitarra"));
//
//        for (Instrumento instrumento : orquesta) {
//            instrumento.afinar();
//        }
//
//        System.out.println("\nLa orquesta comienza a tocar:");
//        for (Instrumento instrumento : orquesta) {
//            instrumento.tocar();
//        }
//    }
}