package practicas.abstractfactory;

import practicas.abstractfactory.model.Mesa;
import practicas.abstractfactory.model.MesaRustica;
import practicas.abstractfactory.model.Silla;
import practicas.abstractfactory.model.SillaRustica;

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