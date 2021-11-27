package patrones.creacional.prototype;

/**
 * Este patrón se basa en la clonación de objetos complejos
 * que pudiesen ser costosos de crear dados los multiples atributos que tengan las clases
 */
public interface PrototypeCard extends Cloneable {

    void getCar();

    PrototypeCard clone() throws CloneNotSupportedException;
}
