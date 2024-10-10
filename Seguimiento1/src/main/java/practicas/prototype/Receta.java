package practicas.prototype;

public abstract class Receta implements Cloneable {
    private String nombre;
    private int tiempoPreparacion;

    public Receta(String nombre, int tiempoPreparacion) {
        this.nombre = nombre;
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public abstract void preparar();

    @Override
    public Receta clone() {
        try {
            return (Receta) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

