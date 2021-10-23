package patrones.creacional.abstractfactory;

public interface AbstractFactory<T> {
    T create(String type);
}
