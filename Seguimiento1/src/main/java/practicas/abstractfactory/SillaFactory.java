package practicas.abstractfactory;

import practicas.abstractfactory.model.Mesa;
import practicas.abstractfactory.model.MesaModerna;
import practicas.abstractfactory.model.Silla;
import practicas.abstractfactory.model.SillaModerna;

public class SillaFactory implements MuebleFactory {
    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaModerna();
    }
}