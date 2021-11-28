package patrones.creacional.abstractfactory;

/**
 * Este factory se encarga de retornar un objeto de una clase específica
 * implementando la interfaz "AbstractFactory" con objeto generico que en este caso
 * será de tipo "PaymentMethod"
 */
public class PaymentMethodFactory implements  AbstractFactory<PaymentMethod> {
    @Override
    public PaymentMethod create(String type) {
        if("CREDIT".equals(type)){
            return new Credit();
        } else if ("DEBIT".equals(type)){
            return new Debit();
        }
        return null;
    }
}
