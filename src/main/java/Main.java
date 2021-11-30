import patrones.comportamiento.chainofresponsability.Tarteja;
import patrones.creacional.abstractfactory.AbstractFactory;
import patrones.creacional.abstractfactory.Card;
import patrones.creacional.abstractfactory.FactoryProvider;
import patrones.creacional.abstractfactory.PaymentMethod;
import patrones.creacional.factorymethod.Payment;
import patrones.creacional.factorymethod.PaymentFactory;
import patrones.creacional.factorymethod.TypePayment;
import patrones.creacional.prototype.PrototypeCard;
import patrones.creacional.prototype.PrototypeFactory;

import static patrones.creacional.prototype.PrototypeFactory.CartType.AMEX;
import static patrones.creacional.prototype.PrototypeFactory.CartType.VISA;

public class Main {
    public static void main(String[] args) {

        /**
         * Patrones de diseño creacionales
         */
        //probarFactoryMethod();
        //probarAbstractFactory();
        //probarBuilder();
        //probarPrototype();
        //probarSingleton();

        /**
         * Patrones de diseño de comportamiento
         */
        probarChainOfResponsability();
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

        System.out.println("Una tarjeta de tipo: " + tarjeta.getCardType() +
                " con el método de pago: " + paymentMethod.doPayment());
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

    private static void probarPrototype(){
        PrototypeFactory.loadCard();

        try{
            PrototypeCard visa = PrototypeFactory.getInstance(VISA);
            visa.getCar();

            PrototypeCard amex = PrototypeFactory.getInstance(AMEX);
            amex.getCar();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }

    private static void probarSingleton(){
        patrones.creacional.singleton.Card.getInstancia().setCardNumber("111-111-111-111");
        System.out.println(patrones.creacional.singleton.Card.getInstancia().getCardNumber());
    }

    private static void probarChainOfResponsability(){
        Tarteja tarteja = new Tarteja();
        tarteja.creditCardRequest(40000);
    }
}
