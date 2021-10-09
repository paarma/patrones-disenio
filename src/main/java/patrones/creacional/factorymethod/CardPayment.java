package patrones.creacional.factorymethod;

public class CardPayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("xxxxxxxxxxxxxxxx Pagando con targeta de credito");
    }
}
