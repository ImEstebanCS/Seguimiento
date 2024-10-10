package practicas.abstractfactory;

public class MesaFactory implements MuebleFactory {
    @Override
    public Silla crearSilla() {
        return new SillaRustica();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaRustica();
    }
}