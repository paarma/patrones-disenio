package patrones.creacional.prototype;

/**
 * Esta clase representaría una clase compleja para ser clonada
 * (En este caso solo tiene un atributo pero el fin de patrón es que se clonen
 * objetos complejos con multiples atributos)
 */
public class Amex implements PrototypeCard {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCar() {
        System.out.println("Esta es una tarjeta Amex");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Clonando tarjeta Amex ...");
        return (Amex) super.clone();
    }
}
