package practicas.abstractfactory.model;

public class MesaModerna implements Mesa {
    @Override
    public void usar() {
        System.out.println("Usando una mesa moderna");
    }
}