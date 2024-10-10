package practicas.prototype;

import practicas.prototype.Model.Receta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ingredientesBase = new ArrayList<>();
        ingredientesBase.add("Masa de pizza");
        ingredientesBase.add("Salsa de tomate");
        ingredientesBase.add("Queso doble crema");
        ingredientesBase.add("Arina ");

        Receta pizzaBase = new Receta("Pizza Basica", ingredientesBase, "Hornear a 200°C por 10 minutos.");


        Receta pizzaPepperoni = pizzaBase.clone();
        pizzaPepperoni.setNombre("Pizza Pepperoni");
        pizzaPepperoni.getIngredientes().add("Pepperoni");


        Receta pizzaVegana = pizzaBase.clone();
        pizzaVegana.setNombre("Pizza Vegana");
        pizzaVegana.getIngredientes().remove("Queso mozzarella");
        pizzaVegana.getIngredientes().add("Queso vegano");
        pizzaVegana.getIngredientes().add("Lechuga");


        System.out.println(pizzaBase);
        System.out.println(pizzaPepperoni);
        System.out.println(pizzaVegana);

    }
}
