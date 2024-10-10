package practicas.prototype.Model;

import java.util.ArrayList;
import java.util.List;

public class Receta  implements Cloneable{
    private String nombre;
    private List<String> ingredientes;
    private String instrucciones;

    public Receta(String nombre, List<String> ingredientes, String instrucciones) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.instrucciones = instrucciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }


    @Override
    public Receta clone() {
        try {

            Receta copia = (Receta) super.clone();

            copia.ingredientes = new ArrayList<>(this.ingredientes);
            return copia;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Receta: " + nombre + "\nIngredientes: " + ingredientes + "\nInstrucciones: " + instrucciones;
    }
}
