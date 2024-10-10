package practicas.abstractfactory;

import practicas.abstractfactory.model.Mesa;
import practicas.abstractfactory.model.Silla;

public interface MuebleFactory {
    Silla crearSilla();
    Mesa crearMesa();
}