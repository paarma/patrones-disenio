package patrones.creacional.abstractfactory;

/**
 * Esta clase se encarga de retornan una "factoria" específica dependiendo
 * de un parámetro
 */
public class FactoryProvider {
    public static AbstractFactory getFactory(String chooseFactory){
        if("Card".equals(chooseFactory)){
            return new CardFactory();
        } else if ("PaymentMethod".equals(chooseFactory)){
            return new PaymentMethodFactory();
        }
        return null;
    }
}
