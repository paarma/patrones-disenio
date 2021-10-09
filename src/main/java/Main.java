import patrones.creacional.factorymethod.Payment;
import patrones.creacional.factorymethod.PaymentFactory;
import patrones.creacional.factorymethod.TypePayment;

public class Main {
    public static void main(String[] args) {
        probarFactoryMethod();
    }

    private static void probarFactoryMethod(){
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();
    }
}
