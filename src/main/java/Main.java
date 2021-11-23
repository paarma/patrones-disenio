import patrones.creacional.abstractfactory.AbstractFactory;
import patrones.creacional.abstractfactory.Card;
import patrones.creacional.abstractfactory.FactoryProvider;
import patrones.creacional.abstractfactory.PaymentMethod;
import patrones.creacional.factorymethod.Payment;
import patrones.creacional.factorymethod.PaymentFactory;
import patrones.creacional.factorymethod.TypePayment;

public class Main {
    public static void main(String[] args) {
        /**
         * Probar patrón de diseño "FactoryMethod"
         */
        //probarFactoryMethod();

        /**
         * Probar patrón de diseño "AbstractFactory"
         */
        //probarAbstractFactory();

        /**
         * Probar patrón de diseño "Builder"
         */
        probarBuilder();
    }

    private static void probarFactoryMethod(){
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();
    }

    private static void probarAbstractFactory(){
        AbstractFactory abstractFactory = FactoryProvider.getFactory("Card");
        Card tarjeta = (Card) abstractFactory.create("VISA");

        AbstractFactory abstractFactory1 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) abstractFactory1.create("DEBIT");

        System.out.println("Una tarjeta de tipo: " + tarjeta.getCardType() + " con el método de pago: " + paymentMethod.doPayment());
    }

    private static void probarBuilder(){
        patrones.creacional.builder.Card card = new patrones.creacional.builder.Card.CardBuilder("VISA",
                "000 111 222 333")
                .name("Tarjeta test")
                .expires(2020)
                .credit(false)
                .build();

        System.out.println(card);

        patrones.creacional.builder.Card card2 = new patrones.creacional.builder.Card.CardBuilder("MASTER",
                "888 888 888 888")
                .build();

        System.out.println(card2);
    }
}
