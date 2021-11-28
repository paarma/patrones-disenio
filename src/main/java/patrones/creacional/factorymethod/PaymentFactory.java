package patrones.creacional.factorymethod;

/**
 * Este factory se encarga de retornar un objeto de una clase específica dependiendo
 * de un parámetro.
 */
public class PaymentFactory {

    public static Payment buildPayment(TypePayment typePayment){
        switch (typePayment){
            case GOOGLEPAY:
                return new GooglePayment();
            case CARD:
                return new CardPayment();
            default:
                return new CardPayment();
        }
    }
}
