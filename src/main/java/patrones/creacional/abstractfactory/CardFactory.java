package patrones.creacional.abstractfactory;

/**
 * Este factory se encarga de retornar un objeto de una clase específica
 * implementando la interfaz "AbstractFactory" con objeto generico que en este caso
 * será de tipo "Card"
 */
public class CardFactory implements AbstractFactory<Card> {
    @Override
    public Card create(String type) {
        if("VISA".equals(type)){
            return new Visa();
        }else if ("MASTERCARD".equals(type)){
            return new MasterCard();
        }
        return null;
    }
}
