package practicas.abstractFactory.Model;

import practicas.abstractFactory.interfaces.Instrumento;


class Guitarra implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra con acordes.");
    }

    @Override
    public String getNombre() {
        return "Guitarra";
    }
}


class Piano implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando el piano con teclas.");
    }

    @Override
    public String getNombre() {
        return "Piano";
    }
}


class Violin implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando el violín con arco.");
    }

    @Override
    public String getNombre() {
        return "Violín";
    }
}
