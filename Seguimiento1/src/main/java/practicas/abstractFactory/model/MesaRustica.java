package practicas.abstractfactory.model;

public class MesaRustica implements Mesa {
    @Override
    public void usar() {
        System.out.println("Usando una mesa rústica");
    }
}