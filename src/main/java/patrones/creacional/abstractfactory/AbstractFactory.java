package patrones.creacional.abstractfactory;

/**
 * Esta interfaz utiliza un objeto genérico para que pueda ser implementada en diversas
 * factorias para crear diversos objetos por ejemplo en la factoria "CardFactory"
 * y en la "PaymentMeyhodFactory"
 * @param <T>
 */
public interface AbstractFactory<T> {
    T create(String type);
}
