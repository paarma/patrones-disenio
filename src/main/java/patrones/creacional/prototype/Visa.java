package patrones.creacional.prototype;

/**
 * Esta clase representaría una clase compleja para ser clonada
 * (En este caso solo tiene un atributo pero el fin de patrón es que se clonen
 * objetos complejos con multiples atributos)
 */
public class Visa implements PrototypeCard {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCar() {
        System.out.println("Esta es una tarjeta Visa");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Clonando tarjeta visa ...");
        return (Visa) super.clone();
    }
}
